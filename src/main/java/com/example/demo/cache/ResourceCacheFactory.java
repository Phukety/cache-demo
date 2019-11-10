package com.example.demo.cache;

import com.example.demo.bean.ResourceCacheInfo;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 配置项缓存工厂
 */
@Component
public class ResourceCacheFactory {
    //日志
    private static Logger Log = Logger.getLogger(ResourceCacheFactory.class);

    /**
     * 使用@bean注解可以在执行完该方法后，在其他地方可以注入并使用
     *
     * @return
     */
    @Bean
    public ResourceCacheInfo getCache() {
        Log.info("开始加载缓存");
        ResourceCacheInfo cache = new ResourceCacheInfo();
        Log.info("加载下拉框缓存");
        //模拟查询数据库
        cache.setSelectItems(getSelectItemFromDB());
        Log.info("加载配置项缓存");
        //获取公共配置项
        cache.setConfigInfo(getConfigInforomDB());
        return cache;
    }

    /**
     * 模拟查询数据库获取下拉框的key-value集合
     *
     * @return
     */
    private List<Map<String, String>> getSelectItemFromDB() {
        List<Map<String, String>> selectItems = new ArrayList<>();
        Map map = new HashMap();
        map.put("下拉选项一", "下拉选项一");
        selectItems.add(map);
        Map map1 = new HashMap();
        map1.put("下拉选项二", "下拉选项二");
        selectItems.add(map1);
        Map map2 = new HashMap();
        map2.put("下拉选项三", "下拉选项三");
        selectItems.add(map2);
        return selectItems;
    }

    /**
     * 模拟查询数据库获取公共配置的key-value集合
     * 模拟的一些配置项
     *
     * @return
     */
    private List<Map<String, String>> getConfigInforomDB() {
        List<Map<String, String>> configInfo = new ArrayList<>();
        Map map = new HashMap();
        //最大图片上传个数为3
        map.put("MAX_IMAGE_UPLOAD_LENGTH", "3");
        configInfo.add(map);
        Map map1 = new HashMap();
        //请求超时时间20秒
        map1.put("REQUEST_TIME_OUT", "20000");
        configInfo.add(map1);
        Map map2 = new HashMap();
        //是否允许https请求
        map2.put("ALLOW_HTTPS_LOGIN", "1");
        configInfo.add(map2);
        return configInfo;
    }
}
