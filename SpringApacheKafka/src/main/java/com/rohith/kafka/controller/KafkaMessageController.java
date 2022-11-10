package com.rohith.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rohith.kafka.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaMessageController {

	private KafkaProducer kafkaProducer;

	// autowired also can be used.
	public KafkaMessageController(KafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}

	// http://localhost:8080/api/v1/kafka/publish?message="type message"
	@GetMapping("/publish")
	public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message is sent from our end");
	}
}
