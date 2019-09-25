package com.nucleus.service;

import java.util.List;

import com.nucleus.model.Customer;



public interface ICustomerService {

	public void saveData(Customer customer);
	public boolean deleteData(Customer customer);
	public List<Customer> retrieveData();
	public Customer retrievedDataBy(String customerCode);
	public boolean updateData(Customer customer);
}
