package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Example;
import com.example.service.ExampleService;

@Controller
public class FrameController {
	
	private final Logger logger = LoggerFactory.getLogger(FrameController.class);
	
	@Autowired
	ExampleService exampleService;

	@RequestMapping(value="/")
	public String home(Model model) {
		List<Example> examples = exampleService.getExamples();
		logger.info("表中有{}行数据", examples.size());
		
		model.addAttribute("hello", "world");
		model.addAttribute("examples", examples);
		return "index";
	}
}
