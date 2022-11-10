package com.rohith.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic rohithTopic() {
		// there is already a default partition
		return TopicBuilder.name("KTBFFH").partitions(10).build();
	}
	
	@Bean
	public NewTopic rohithTopicJSON() {
		// there is already a default partition
		return TopicBuilder.name("KTBFFHJSON").partitions(10).build();
	}
}
