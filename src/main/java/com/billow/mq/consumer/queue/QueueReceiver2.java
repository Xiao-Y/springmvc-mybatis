package com.billow.mq.consumer.queue;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.stereotype.Service;

@Service
public class QueueReceiver2 implements MessageListener {

	@Override
	public void onMessage(Message message) {

	}

}
