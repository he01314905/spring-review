package myspring.bean;

public class UserService {

	private UserDao userDao;
	
	public void save() {
		userDao.insert();
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
