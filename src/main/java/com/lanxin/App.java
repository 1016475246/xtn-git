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
    public Queue queue() {
        return new ActiveMQQueue("lanxin_queue");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("lanxin_topic");
    }

    //这是SpringBoot启动Main方法
    public static void main(String[] args) {
        //这是一行注解
        SpringApplication.run(App.class, args);
        //这是第二行注解
        
        //这是第三行注解
    }
}
