package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class GetUser {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the id to get user details");
		int id=scanner.nextInt();
		UserDAO userDAO=new UserDAO();
		User user=userDAO.findUserById(id);
	}

}
