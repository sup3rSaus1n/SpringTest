package com.joe.test.ex01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("ex01")
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("/doC")
	public String doC(@ModelAttribute("m") String msg) {
		
		logger.info("doC실행.........");
		
		System.out.println("doC 메시지 = "+msg);
		
		return "doC";
	}

}
