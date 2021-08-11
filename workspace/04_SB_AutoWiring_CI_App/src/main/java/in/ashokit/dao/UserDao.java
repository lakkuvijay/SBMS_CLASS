package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public boolean saveUser(String uname, String email, String pwd) {
		// logic to store in db
		System.out.println("Storing record in database....");
		return true;
	}
}
