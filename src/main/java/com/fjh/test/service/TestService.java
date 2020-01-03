package com.fjh.test.service;

import com.fjh.test.common.ServerResponse;
import com.fjh.test.pojo.Mail;

public interface TestService {

    ServerResponse testIdempotence();

    ServerResponse accessLimit();

    ServerResponse send(Mail mail);
}
