package net.skhu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.dto.User;
import net.skhu.mapper.UserMapper;
import net.skhu.model.UserSignUp;

@Service
public class UserService {

	@Autowired
	public UserMapper userMapper;
	
	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	public User findByLoginName(String loginName) {
		return userMapper.findByLoginName(loginName);
	}
	
	public User createDto(UserSignUp UserSignUp) {
		User user = new User();
		user.setLoginName(UserSignUp.getLoginName());
		user.setPassword(UserSignUp.getPasswd1());
		user.setName(UserSignUp.getEmail());
		user.setEmail(UserSignUp.getEmail());
		user.setEnabled(true);
		user.setUserType("학생");
		if (UserSignUp.getDepartmentId() != 0)
			user.setDepartmentId(UserSignUp.getDepartmentId());
		return user;
	}
	
	public void insert(UserSignUp UserSignUp) {
		User user = createDto(UserSignUp);
		userMapper.insert(user);
	}
	
}
