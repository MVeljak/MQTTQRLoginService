package com.veljak.applications.producers;

import com.veljak.applications.channels.MqttSenderChanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProducerAdapterServive {

    @Autowired
    MqttSenderChanel mqttInputChannel;

//    public MqttPahoMessageDrivenChannelAdapter getAdapter(){
//        MqttPahoMessageDrivenChannelAdapter adapter =
//                new MqttPahoMessageDrivenChannelAdapter("tcp://localhost:1883", UUID.randomUUID().toString());
//        adapter.setCompletionTimeout(5000);
//        adapter.setConverter(new DefaultPahoMessageConverter());
//        adapter.setQos(1);
//        adapter.setOutputChannel(mqttInputChannel.mqttInputChannel());
//        return adapter;
//    }


    @Bean
    public MessageProducer inbound() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter("tcp://localhost:1883", UUID.randomUUID().toString(),
                        "/request", "/response"); // si possono mettere piu topic
        //new MqttPahoMessageDrivenChannelAdapter("tcp://localhost:1883", UUID.randomUUID().toString());
        adapter.setCompletionTimeout(5000);
        adapter.setConverter(new DefaultPahoMessageConverter());
        adapter.setQos(1);
        adapter.setOutputChannel(mqttInputChannel.mqttInputChannel());
        return adapter;
    }
}
