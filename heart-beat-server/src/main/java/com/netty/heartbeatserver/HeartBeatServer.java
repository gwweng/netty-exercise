package com.netty.heartbeatserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author gengweiweng
 * @time 2022/4/9
 * @desc
 */
@Component
@Slf4j
public class HeartBeatServer {

    @PostConstruct
    public void start(){
        log.info("【Netty服务端】启动");
        Thread.yield();
    }
}
