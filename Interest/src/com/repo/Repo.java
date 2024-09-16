package com.repo;

import java.util.HashMap;
import java.util.Map;

public class Repo {
	static Map< String, User> users;
	static {
		users = new HashMap<String, User>();
		users.put("Admin",new User("Admin","admin123","Manager"));
		users.put( "HR",new User("HR","hr","Human Resource"));
	}

	public static Map<String,User> getUsers() {
		return users;
	}

}
