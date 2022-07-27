package com.deloitte.wwg.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deloitte")
public class WwgController {

    @GetMapping("/message")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hi KD!");
	}
}
