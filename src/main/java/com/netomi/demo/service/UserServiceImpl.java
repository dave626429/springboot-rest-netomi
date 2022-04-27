//package com.netomi.demo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.netomi.demo.entity.Question;
//import com.netomi.demo.entity.User;
//import com.netomi.demo.repository.UserRepository;
//
////@Service
//public class UserServiceImpl implements UserService {
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@Override
//	public User askQuestion(Question question,Long userId) {
//		
//		return null;
//	}
//
//	@Override
//	public User answerQuestion(User user) {
//		// TODO Auto-generated method stub
//		return userRepository.save(user);
//	}
//
//	@Override
//	public User questionValidation(User user) {
//		try {
//			
//		} catch (Exception e) {
//
//		}
//		return null;
//	}
//
//	@Override
//	public String deleteQuestion(Integer questionId) {
//		try {
////			Optional<User> user = userRepository.findById(userId);
//			userRepository.deleteById(questionId);
//			return "User Deleted";
//		} catch (Exception e) {
//			return e.getMessage();
//		}
////		
//	}
//
//}
