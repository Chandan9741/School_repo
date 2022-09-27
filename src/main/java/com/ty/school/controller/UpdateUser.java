package com.ty.school.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class UpdateUser {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setEmail("chendu@gmail.com");
		user.setPassword("fdcs");
		user.setPhone(454155);
		user.setGender("m");
		
		UserDAO userDAO=new UserDAO();
		userDAO.updateUser(user);
	}

}
