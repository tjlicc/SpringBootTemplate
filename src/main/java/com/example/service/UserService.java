package com.example.service;

import java.util.List;

import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;

/**
 * @author licc 
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUserList() {
		return userDao.queryBySelective();
	}
	
}
