package com.veljak.applications.gateways;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

@Component
@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttSenderGateway {

    void sendToMqtt(String data);
}
