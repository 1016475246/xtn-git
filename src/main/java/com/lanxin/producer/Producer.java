package com.lanxin.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @Author: MaFan
 * @Description:
 * @Date: Created in 16:19 2019/5/9
 * @Modified By:
 */
@RestController
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @RequestMapping("/producer1")
    public String producer1() {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "点对点：Queue，不可重复消费");
        return "queue";
    }

    @RequestMapping("/producer2")
    public String producer2() {
        this.jmsMessagingTemplate.convertAndSend(this.topic, "发布/订阅：Topic，可以重复消费");
        return "topic";
    }

}
