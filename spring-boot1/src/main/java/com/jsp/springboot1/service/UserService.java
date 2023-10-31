package com.jsp.springboot1.service;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.springboot1.dao.UserDao;
import com.jsp.springboot1.dto.ResponseStructure;
import com.jsp.springboot1.dto.User;
import com.jsp.springboot1.exception.NoSuchUserIdFoundException;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

//	public User saveUser(User user) {
//		User u = userDao.emailCheck(user.getEmail());
//		if (u == null) {
//			return userDao.saveUser(user);
//		} else {
//			return null;
//		}
//	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public ResponseStructure<User> getUserById(int id) throws NoSuchUserIdFoundException {
		User user = userDao.getUserById(id);
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();

		if(user!=null) {
			responseStructure.setData(user);
			responseStructure.setMessage("User found");
			responseStructure.setStatus_code(HttpStatus.CREATED.value());
			
		}else {
			throw new NoSuchUserIdFoundException();
			
		}
		return responseStructure;
	}

	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}

	public User updateUserById(int id, User user) {
		User u = userDao.getUserById(id);
		if (u != null) {
			u.setName(user.getName());
			u.setEmail(user.getEmail());
			u.setPassword(user.getPassword());
			return userDao.updateUserById(id, u);
		} else {
			return null;
		}
	}

	public User validateUser(String email, String password) {
		return userDao.validateUser(email, password);
	}
	
	public ResponseStructure<User> saveUser(User user){
		if(user!=null) {
			ResponseStructure<User> responseStructure = new ResponseStructure<User>();
			responseStructure.setData(userDao.saveUser(user));
			responseStructure.setStatus_code(HttpStatus.CREATED.value());
			responseStructure.setMessage("User saved succefully");
			return responseStructure;
			
		}
		else {
			ResponseStructure<User> responseStructure = new ResponseStructure<User>();
			responseStructure.setData(null);
			responseStructure.setStatus_code(400);
			responseStructure.setMessage("User not found to save");
			return responseStructure;
		}
	}
	 
}
