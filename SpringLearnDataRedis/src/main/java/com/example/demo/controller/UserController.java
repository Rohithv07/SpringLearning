/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * @author rohithvazhathody
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) {
		User user = userService.getUserById(id);
		return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
	}

	@PostMapping("/addUser")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User userSaved = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userSaved);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
}