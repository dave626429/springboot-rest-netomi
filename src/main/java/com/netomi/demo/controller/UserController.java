package com.netomi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netomi.demo.entity.Question;
import com.netomi.demo.service.QuestionService;

@RestController
public class UserController {

//	@Autowired
//	private UserService userService;

	@Autowired
	QuestionService questionService;

	@PostMapping(path = "/")
	@ResponseBody
	public Question postQuestion(@RequestBody Question question) {
		System.out.println(question);

		return questionService.askQuestion(question);
	}

//	@PostMapping(path = "/{userid}")
//	public User postAnwser(@RequestBody User user) {
//		return userService.answerQuestion(user);
//	}

}
