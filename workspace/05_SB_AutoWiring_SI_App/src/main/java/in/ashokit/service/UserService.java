package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;
import in.ashokit.util.EmailUtils;
import in.ashokit.util.PwdUtils;

@Service
public class UserService {

	private PwdUtils pwdUtils;

	private EmailUtils emailUtils;

	private UserDao userDao;

	public UserService() {
		System.out.println("UserService::Constructor");
	}

	@Autowired
	public void setPwdUtils(PwdUtils pwdUtils) {
		this.pwdUtils = pwdUtils;
	}

	@Autowired
	public void setEmailUtils(EmailUtils emailUtils) {
		this.emailUtils = emailUtils;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void registerUser() {
		pwdUtils.encryptPwd();
		userDao.save();
		emailUtils.sendEmail();
		System.out.println("User Record Saved....");
	}

}
