package com.veljak.applications.gateways;

import com.veljak.applications.channels.MqttSenderChanel;
import com.veljak.applications.producers.MessageProducerBean;
import com.veljak.applications.producers.ProducerAdapterServive;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;

@SpringBootTest
class MqttSenderGatewayImplTest {

    @Autowired
    MqttSenderGateway mqttSenderGateway;


    @BeforeEach
    void setUp() {
    }

    @Test
    void sendToMqtt() {
        mqttSenderGateway.sendToMqtt("test data sender");

    }
}