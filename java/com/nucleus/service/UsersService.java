package com.nucleus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleus.dao.IUserDao;
import com.nucleus.model.Authorities;
import com.nucleus.model.Users;
import com.nucleus.utility.BCryptPassword;


@Service
public class UsersService implements IUsersService{

	@Autowired
	BCryptPassword bCryptPassword;
	
	@Autowired
	IUserDao iUserDao;
	
	
	
	

	@Override
	public void saveData1(Users users) {
		
		String password=bCryptPassword.bCryptpassword(users.getPassword());
		
		users.setPassword(password);
		users.setEnabled(1);
		iUserDao.savedata1(users);
		
	}





	@Override
	public Users retrieveData(Users users) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
