package service;

import java.util.ArrayList;
import java.util.List;

import dto.User;

public class UserService {
	
	private static List<User> list = new ArrayList<>();
	
	// thêm mới
	public void create(User user) {
		list.add(user);
	}
	
	// search
	public List<User> getAll(){
		return list;
	}
}
