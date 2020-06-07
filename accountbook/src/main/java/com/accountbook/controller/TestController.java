package com.accountbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accountbook.dto.TestDTO;
import com.accountbook.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView test() throws Exception{
		
		ModelAndView mav = new ModelAndView();
		List<TestDTO> testList = testService.selectTest();
		System.out.println(testList.size());
		mav.addObject("list", testList);
		mav.setViewName("test");
		
		return mav;
		
	}
}
