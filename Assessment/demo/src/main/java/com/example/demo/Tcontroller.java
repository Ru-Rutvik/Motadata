package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody  
public class Tcontroller {
  
	@RequestMapping("/test")
	public String handler() {
		return "this is just for demo";
	}
}
