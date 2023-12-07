package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.KafkaProducer;

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaProducer kafkaProducer;

	public KafkaController(KafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}
	
	@GetMapping("/message")
	public ResponseEntity<String> publish(@RequestBody String message) {
		kafkaProducer.sendMessage(message);
		return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
	}
}
