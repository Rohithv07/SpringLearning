/**
 * 
 */
package com.example.ratelimit.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;

/**
 * @author rohithvazhathody
 */
@Service
public class RateLimitService {
	private final Bucket bucketRateLimit;

	public RateLimitService() {
		Bandwidth limit = Bandwidth.classic(10, Refill.intervally(10, Duration.ofMinutes(1)));
		this.bucketRateLimit = Bucket.builder().addLimit(limit).build();
	}

	public boolean isRateLimited() {
		return bucketRateLimit.tryConsume(1);
	}

}
