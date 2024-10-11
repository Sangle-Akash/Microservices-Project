package com.example.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetMassageController {
	@Autowired
	private WelcomeApiClient wac;
	
@GetMapping("greet-msg")
	public String getGreetMassage()
	{
	  
		String welmsg=wac.invokWelcomeMsg();
		String greetMsg="Good Morning";
		return welmsg.concat(greetMsg);
		
	}
}
