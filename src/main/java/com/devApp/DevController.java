package com.devApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {
	
	@GetMapping(value="/ajay")
	public String getMethodName() {
		return "ajay";
	}
	
	
	

}
