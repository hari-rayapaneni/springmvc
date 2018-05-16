package com.spring.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@RestController
public class ApplicationController {
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public @ResponseBody Map<String,String> hello() {
		
		System.out.println("hello method");
		
		Map<String,String> map = new HashMap<>();
		map.put("name", "krishna");
		return map;
		
	}
	
}