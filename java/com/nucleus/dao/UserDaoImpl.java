package com.nucleus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.nucleus.model.Users;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean savedata1(Users users) {
		
		Object obj1[]={users.getUsername(),users.getPassword(),users.getEnabled()};
		
		jdbcTemplate.update("insert into uservedica27 values(?,?,?)",obj1);
		
		Object obj2[]={users.getUsername(),users.getAuthorities().getRole()};
		
		jdbcTemplate.update("insert into authoritiesvedica27 values(?,?)",obj2);
		return true;
	}

	@Override
	public Users retriveData1(Users users) {
		
		return null;
	}

}
