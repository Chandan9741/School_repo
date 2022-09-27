package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class GetUser {

	public static void main(String[] args) {
		
		UserDAO userDAO=new UserDAO();
		User user=userDAO.findUserById(2);
	}

}
