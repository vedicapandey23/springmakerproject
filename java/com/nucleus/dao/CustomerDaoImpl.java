package com.nucleus.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Customer;
import com.nucleus.utility.CustomerRowMapper;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	
	private static final Logger logger = Logger.getLogger(CustomerDaoImpl.class);
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean savedata(Customer customer) {
		Object obj[]={customer.getCustomerCode(),customer.getCustomerName(),customer.getCustomerAddress1(),customer.getCustomerAddress2(),customer.getCustomerPinCode(),customer.getEmailAddress(),customer.getContactNumber(),customer.getPrimaryContactPerson(),customer.getRecordStatus(),customer.getActiveInactiveFlag(),customer.getCreatedBy(),customer.getModifiedDate(),customer.getModifiedBy(),customer.getAuthorizedDate(),customer.getAuthorizedBy()};
		jdbcTemplate.update("insert into customerVedica values(seq_cust77.nextval,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,?)",obj);
	
		return true;
	}

	@Override
	public boolean updatedata(Customer customer) {
		
		
		Object obj[]={customer.getCustomerName(),customer.getCustomerAddress1(),customer.getCustomerAddress2(),customer.getCustomerPinCode(),customer.getEmailAddress(),customer.getContactNumber(),customer.getPrimaryContactPerson(),customer.getRecordStatus(),customer.getActiveInactiveFlag(),customer.getCustomerCode()};
		int result=jdbcTemplate.update("update  customerVedica set customerName=?,customerAddress1=?,customerAddress2=?,customerPinCode=?,emailAddress=?,contactNumber=?,primaryContactPerson=?,recordState=?,activeOrIncactiveFlag=?,modifieddate=sysdate where coustomerCode=?",obj);
		
		if(result==1)
		{
		return true;
		}
		else return false;
		
		
	}

	@Override
	public List<Customer> retrievedata() {
		return jdbcTemplate.query("select * from customerVedica",new CustomerRowMapper())  ;
	}

	@Override
	public boolean deletedata(Customer customer) {
		
		
		Object obj[]={customer.getCustomerCode()};
	int result=jdbcTemplate.update("delete from customerVedica where coustomerCode=?",obj);
		
		if(result==1)
		{
			return true;
		}
		else
		{	logger.info("value cannot be deleted from db");
			return false;
		}
		
		
		
		
	}

	@Override
	public Customer retrievedataby(String customerCode) {
		
		try
		{String[] obj={customerCode};
		  Customer customer1= (Customer) jdbcTemplate.queryForObject("select * from customerVedica where coustomerCode=?", obj, new CustomerRowMapper())  ;
		  return customer1;
		}
		catch(EmptyResultDataAccessException  e)
		{
			logger.error(e);
			return null;
		}
	}

}
