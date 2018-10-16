package com.ifsbank.agent.task;

import com.ifsbank.agent.util.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author: furunxin
 * @Date: 2018/9/11 10:56
 * @Description:
 */

@Slf4j
@Component
public class HeartTask {

    private static final String KEY_FIX="monitor_server:";

    @Resource
    RedisTemplate<String,String> redisTemplate;

    @Scheduled(cron = "0/1 * * * * ?")
    public void sendHeart(){
        log.info("执行了");
        String ip = IpUtil.getLocalHostIp();
        redisTemplate.opsForValue().set(KEY_FIX+ ip,ip,1, TimeUnit.SECONDS);
    }
}
