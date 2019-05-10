package com.lanxin;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
public class App {
    
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("lanxin_queue");
    }

    @Bean
    public Topic topic(){
        return new ActiveMQTopic("lanxin_topic");
    }
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
