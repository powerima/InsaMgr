package com.pino.insa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pino.insa.domain.InsaVo;

@Controller
@RequestMapping("/insa/")
public class InsaController {
	
	public InsaController() {
		System.out.println("===> InsaController create");
	}
	
	@PostMapping("/insertInsa.do")
	public String insertInsa(InsaVo vo) {
		System.out.println(vo);
		return "insertInsa: " + vo; 
	}
}
