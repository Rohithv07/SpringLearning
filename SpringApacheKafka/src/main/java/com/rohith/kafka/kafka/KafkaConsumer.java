package com.rohith.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "KTBFFH", groupId = "myGroup")
	public void consumeMessage(String message) {
		LOGGER.info(String.format("Message received : %s", message));

	}

}
