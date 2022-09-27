package com.ty.school.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class SaveUser {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setEmail("chandu@gmail.com");
		user.setPassword("fvdcs");
		user.setPhone(45415);
		user.setGender("male");

		UserDAO userDAO=new UserDAO();
		User u=userDAO.saveUser(user);
	}

}
