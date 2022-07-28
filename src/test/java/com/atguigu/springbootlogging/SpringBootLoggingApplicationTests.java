package com.atguigu.springbootlogging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLoggingApplicationTests {

    //启用记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        //日志级别 trace<debug<info<warn<error
        System.out.println("我已打开日志记录级别，感觉良好！");
        logger.trace("这是trace");
        logger.debug("这是debug");
        System.out.println("---这是spring boot 默认输出的日志级别--");
        logger.info("这是info");
        logger.warn("这是warn");
        logger.error("这是error");


    }

}
