package com.billow.mq2.producer.queue;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class QueueProducer {

	@Resource(name="jmsQueueTemplate")
	private JmsTemplate jmsQueueTemplate;
	
	public void sendMessage(Destination destination,final String msg){
		System.out.println("向队列" + destination.toString() + "发送了消息------------" + msg);
		jmsQueueTemplate.send(destination, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}
		});
	}
}
