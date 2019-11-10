package com.example.demo.bean;

import java.util.List;
import java.util.Map;

/**
 * 用于存放需要缓存的配置信息
 * 可以缓存任何你需要缓存的数据类型
 * 可以在一个类似ResourceCacheInfo的类中封装多种配置项
 * 也可以将不同配置项封装在一个或多个类似ResourceCacheInfo的类中
 */
public class ResourceCacheInfo {
    /**
     * 下拉框选项
     * 例1：用于存放下拉框的选项集合
     */
    private List<Map<String,String>> selectItems;
    //
    /**
     * 项目基础配置项
     * 例2：用于存放全局配置信息项
     */
    private List<Map<String,String>> configInfo;

    public List<Map<String, String>> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<Map<String, String>> selectItems) {
        this.selectItems = selectItems;
    }

    public List<Map<String, String>> getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(List<Map<String, String>> configInfo) {
        this.configInfo = configInfo;
    }
}
