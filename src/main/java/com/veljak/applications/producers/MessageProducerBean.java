package com.veljak.applications.producers;

import com.veljak.applications.channels.MqttSenderChanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class MessageProducerBean {

//    @Autowired
//    ProducerAdapterServive producerAdapterServive;
//    @Autowired
//    MqttSenderChanel mqttInputChannel;
//
//    public MessageProducer inbound(String... topics) {
//        MqttPahoMessageDrivenChannelAdapter adapter = producerAdapterServive.getAdapter();
//        adapter.addTopic(topics);
//
//        return adapter;
//    }


}
