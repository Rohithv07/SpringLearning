/**
 * 
 */
package com.example.ratelimit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratelimit.service.RateLimitService;

/**
 * @author rohithvazhathody
 */
@RestController
@RequestMapping("/test")
public class RatelimitHelloworldController {
	private RateLimitService rateLimitService;

	public RatelimitHelloworldController(RateLimitService rateLimitService) {
		this.rateLimitService = rateLimitService;
	}

	@GetMapping("/rateLimit")
	public ResponseEntity<String> getHelloWord() {
		if (!rateLimitService.isRateLimited()) {
			return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("Too Many Requests fired");
		}
		return ResponseEntity.ok("Hello world");
	}

}
