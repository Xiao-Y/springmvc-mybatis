package com.billow.mq.producer.queue;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

//	@Resource(name = "jmsQueueTemplate")
	private JmsTemplate jmsQueueTemplate;

	/**
	 * 发送消息
	 * 
	 * @param queueName
	 *            队列名称
	 * @param message
	 *            信息
	 * @author XiaoY
	 * @date: 2017年3月7日 下午8:56:07
	 */
	public void sendMessage(String queueName, final String message) {

		jmsQueueTemplate.send(queueName, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

}
