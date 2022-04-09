package com.netty.heartbeatclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author gengweiweng
 * @time 2022/4/10
 * @desc
 */
@Component
@Slf4j
public class HeartBeatClient {

    @PostConstruct
    public void start() throws InterruptedException {
        log.info("【Netty客户端】启动成功");
    }
}
