package com.bh.dao;

import java.util.List;

import com.bh.model.SignupDetails;
import com.bh.model.UserDetails;

public interface UserDetailsDao {
	public String addUser(SignupDetails signupUserDetail);
	public List<UserDetails> showUser(String email);
	public UserDetails updateUser(UserDetails userDetail);

}
