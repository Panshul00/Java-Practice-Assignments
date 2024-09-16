package com.service;

import com.repo.Repo;
import com.repo.User;

public class Service {
	public boolean validateUser(String uname, String pass) {

		if (Repo.getUsers().containsKey(uname)) {
			if ((Repo.getUsers().get(uname)).getPwd().equals(pass)) {
				return true;
			} else
				return false;
		} else
			return false;
	}

	public void addUser(String uname, User user) {
		Repo.getUsers().put(uname, user);
		System.out.println("User added");
	}
}