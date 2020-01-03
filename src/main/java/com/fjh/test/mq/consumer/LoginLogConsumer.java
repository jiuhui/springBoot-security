package com.fjh.test.mq.consumer;

import com.fjh.test.mq.BaseConsumer;
import com.fjh.test.mq.MessageHelper;
import com.rabbitmq.client.Channel;
import com.fjh.test.mq.BaseConsumer;
import com.fjh.test.mq.MessageHelper;
import com.fjh.test.pojo.LoginLog;
import com.fjh.test.service.LoginLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginLogConsumer implements BaseConsumer {

    @Autowired
    private LoginLogService loginLogService;

    @Override
    public void consume(Message message, Channel channel) {
        log.info("收到消息: {}", message.toString());
        LoginLog loginLog = MessageHelper.msgToObj(message, LoginLog.class);
        loginLogService.insert(loginLog);
    }
}
