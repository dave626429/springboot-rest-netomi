package com.netomi.demo.service;

import org.springframework.stereotype.Service;

import com.netomi.demo.entity.Question;
import com.netomi.demo.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	QuestionRepository questionRepo;

	@Override
	public Question askQuestion(Question question) {
	
		return questionRepo.save(question);
	}

}
