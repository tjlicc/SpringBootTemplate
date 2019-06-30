package com.example.controller;

import java.util.List;

import com.example.model.File;
import com.example.model.User;
import com.example.service.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.UserService;

/**
 * @author licc 
 */
@Controller
public class FrameController {
	
	private final Logger logger = LoggerFactory.getLogger(FrameController.class);
	
	@Autowired
    UserService userService;
	
	@Autowired
    FileService fileService;

	@RequestMapping(value="/")
	public String home(Model model) {
		List<User> userList = userService.getUserList();
		logger.info("User表中有{}行数据", userList.size());
		
		List<File> fileList = fileService.getFileList();
        logger.info("File表中有{}行数据", userList.size());
		
		model.addAttribute("hello", "world");
		model.addAttribute("userList", userList);
        model.addAttribute("fileList", fileList);
		return "index";
	}
}
