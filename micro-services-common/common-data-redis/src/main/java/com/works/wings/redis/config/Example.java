package com.works.wings.redis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

@Service
public class Example {
    private final RedisTemplate<String,Object> redisTemplate;

    @Autowired
    public Example(RedisTemplate<String,Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    public void init(){
        redisTemplate.opsForHash().putAll("apps:testapp",Map.of("names","zdm"));
        Object o = redisTemplate.opsForHash().get("apps:testapp","names");
        System.out.println(o);
    }
}