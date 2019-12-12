package com.wisewin.erp.service;

import com.wisewin.erp.utils.AnnotationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;


@Service
public class InterfaceContainer {
    private final Map<String, Integer> nameTypeMap;
    private final Map<Integer, ICommonQuery> configComponentMap;

    public InterfaceContainer() {
        nameTypeMap = new HashMap<>();
        configComponentMap = new HashMap<>();
    }


    @Autowired(required = false)
    private void init(ICommonQuery[] configComponents) {
        for (ICommonQuery configComponent : configComponents) {
            ResourceInfo info = AnnotationUtils.getAnnotation(configComponent, ResourceInfo.class);
            if (info != null) {
                initResourceInfo(info);
                configComponentMap.put(info.type(), configComponent);
            }
        }
    }

    public int getResourceType(String apiName) {
        if (!nameTypeMap.containsKey(apiName)) {
            throw new RuntimeException("资源:" + apiName + "的组件不存在");
        }
        return nameTypeMap.get(apiName);
    }

    public ICommonQuery getCommonQuery(String apiName) {
        return getCommonQuery(this.getResourceType(apiName));
    }

    private ICommonQuery getCommonQuery(int resourceType) {
        Assert.isTrue(configComponentMap.containsKey(resourceType),"getCommonQuery NOT containsKey");
        return configComponentMap.get(resourceType);
    }

    private synchronized void initResourceInfo(ResourceInfo info) {
        if (nameTypeMap.containsKey(info.value())) {
            Assert.isTrue(nameTypeMap.get(info.value()).equals(info.type()),"initResourceInfo Not equals");
        } else {
            nameTypeMap.put(info.value(), info.type());
        }
    }

}
