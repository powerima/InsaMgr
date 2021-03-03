package com.pino.insa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pino.insa.domain.TestVo;

@RestController
public class TestController {
	
	public TestController() {
		System.out.println("===> TestController 생성하기");
	}
	
//	@GetMapping(value="/insertTest.do")
//	public String insertTest(TestVo vo) {
//		System.out.println(vo);
//		return "insertTest: " + vo;
//	}
//	
	
	@PostMapping(value="/insertTest.do") public String insertTest(TestVo vo) {
	System.out.println(vo); return "insertTest: " + vo; }
 
	
	
	
	@GetMapping("/test")
	public String test(String name) {
		System.out.println("test method");
		return "test: " + name;
	}
	
	
}
