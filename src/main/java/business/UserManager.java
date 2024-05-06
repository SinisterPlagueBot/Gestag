package business;

import beans.User;
import dao.UserDaoImplOrcl;

public class UserManager implements UserBusiness{
	private UserDaoImplOrcl usr; 
		
	public UserManager() {
		super();
	}

	public UserManager(UserDaoImplOrcl usr) {
		super();
		this.usr = usr;
	}

	public boolean determineExistant(User user) {
		if(usr.selectUser(user.getUserName(), user.getPassword()).equals(user)) {
			return true;
		}
		return false;
	}
}
