package com.example.demo.res;

import com.example.demo.bean.ResourceCacheInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheRes {
    //日志
    private static Logger Log = Logger.getLogger(CacheRes.class);
    //自动注入bean
    @Autowired
    private ResourceCacheInfo cache;

    @GetMapping("/cache")
    public ResourceCacheInfo getCache() {
        Log.info("下拉框缓存内容:"+cache.getSelectItems());
        Log.info("配置项缓存内容:"+cache.getConfigInfo());
        return cache;
    }
}
