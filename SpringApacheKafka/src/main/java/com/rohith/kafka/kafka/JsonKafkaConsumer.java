package com.rohith.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.rohith.kafka.model.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

	@KafkaListener(topics = "KTBFFHJSON", groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("JSON message is received: %s", user.toString()));

	}
}
