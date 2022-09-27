package com.ty.school.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class SaveUser {

	public static void main(String[] args) {
		User user=new User();
		
		user.setEmail("chethu@gmail.com");
		user.setPassword("fdcs");
		user.setPhone(4515);
		user.setGender("male");

		UserDAO userDAO=new UserDAO();
		User u=userDAO.saveUser(user);
	}

}
