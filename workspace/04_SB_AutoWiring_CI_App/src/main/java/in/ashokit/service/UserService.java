package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {

	private UserDao userDao;

	@Autowired
	public UserService(UserDao userDao) {
		System.out.println("UserService :: 1-Param Constructor");
		this.userDao = userDao;
	}

	public UserService() {
		System.out.println("UserService :: 0-Param Constructor");
	}

	public void registerUser() {
		boolean isSaved = userDao.saveUser("ashok", "ashokitschool@gmail.com", "ashok@123");
		if (isSaved) {
			System.out.println("Record Saved....");
		} else {
			System.out.println("Failed to save....");
		}
	}
}
