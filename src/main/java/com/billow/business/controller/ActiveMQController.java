package com.billow.business.controller;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billow.mq2.producer.queue.QueueProducer;
import com.billow.mq2.producer.topic.TopicProducer;

@Controller
@RequestMapping("/activeMQ")
public class ActiveMQController {

	@Resource
	private QueueProducer queueProducer;

	@Resource
	private Destination demoQueueDestination;

	@Resource
	private TopicProducer topicProducer;

	@Resource(name = "demoTopicDestination")
	private Destination demoTopicDestination;

	@RequestMapping("/mqIndex")
	public String mqIndex() {
		return "activemqIndex";
	}

	@ResponseBody
	@RequestMapping("/queueSender")
	public String queueSender(@RequestParam("message") String message) {
		String op = "";
		try {
			queueProducer.sendMessage(demoQueueDestination, message);
			op = "suc";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return op;
	}

	@ResponseBody
	@RequestMapping("/topicSender")
	public String topicSender(@RequestParam("message") String message) {
		String op = "";
		try {
			topicProducer.sendMessage(demoTopicDestination, message);
			op = "suc";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return op;
	}
}
