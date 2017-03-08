package com.billow.business.controller;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billow.mq2.producer.queue.QueueProducer;

@Controller
@RequestMapping("/activeMQ")
public class ActiveMQController {

	@Resource
	private QueueProducer queueProducer;

	@Resource(name = "demoQueueDestination")
	private Destination destination;

	@RequestMapping("/mqIndex")
	public String mqIndex() {
		return "activemqIndex";
	}

	@ResponseBody
	@RequestMapping("/queueSender")
	public String queueSender(@RequestParam("message") String message) {
		String op = "";
		try {
			queueProducer.sendMessage(destination, message);
			op = "suc";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return op;
	}
}
