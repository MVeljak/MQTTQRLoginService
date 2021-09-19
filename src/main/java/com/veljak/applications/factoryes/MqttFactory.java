package com.veljak.applications.factoryes;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MqttFactory {

    @Bean
    public MqttPahoClientFactory mqttClientFactory() {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        MqttConnectOptions options = new MqttConnectOptions();
        options.setServerURIs(new String[] { "tcp://localhost:1883"}); // si possono mettere più server
        //options.setUserName("username");
        //options.setPassword("password".toCharArray());
        factory.setConnectionOptions(options);
        return factory;
    }
}
