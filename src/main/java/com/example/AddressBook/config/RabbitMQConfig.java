package com.example.AddressBook.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue contactAddQueue() {
        return new Queue("contact.add.queue", true);
    }


}
