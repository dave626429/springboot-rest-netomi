package com.netomi.demo.service;



import com.netomi.demo.entity.Question;
import com.netomi.demo.entity.User;

public interface UserService {
	public User askQuestion(Question question,Long userId);
	
	public User answerQuestion(User user);
	
	/*
	 * to check the question appropriate or not
	 */
	public User questionValidation(User user);
	
	public String deleteQuestion(Integer questionId);
	
}


//1. user can ask a question
//2. User can asnwer a question
//3. Mark a question in appropriate - update - admin
//4. Delete a question - admin