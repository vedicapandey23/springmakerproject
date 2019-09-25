package com.nucleus.dao;

import java.util.List;

import com.nucleus.model.Customer;



public interface ICustomerDao {

	public boolean savedata(Customer customer);	
	public boolean updatedata(Customer customer);
	public List<Customer> retrievedata();
	public boolean deletedata(Customer customer);
	public Customer retrievedataby(String customerCode);
}
