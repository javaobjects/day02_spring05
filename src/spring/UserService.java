package spring;

public class UserService {

	private IUserDao userDao;
	
	public UserService()
	{
		System.out.println("new UserService() 实例化");
	}
	
	public UserService(IUserDao userDao)
	{
		this.userDao = userDao;
		
		System.out.println("new UserService("+userDao+") 实例化");
	}
	
	public void findUsers()
	{
	    userDao.selectUser();
	}
}
