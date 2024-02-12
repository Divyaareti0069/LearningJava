package com.example.demorestjavabrains.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hellocontroller")
	public String Hi() {
		return "hi";
	}

}
