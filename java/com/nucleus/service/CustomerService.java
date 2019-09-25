package com.nucleus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleus.dao.ICustomerDao;
import com.nucleus.model.Customer;

@Service
public class CustomerService implements ICustomerService{

	
	@Autowired
	ICustomerDao iCustomerDao;
	
	@Override
	public void saveData(Customer customer) {
	
		
		customer.setRecordStatus("N");
		customer.setCreatedBy("");
		customer.setModifiedDate(null);
		customer.setModifiedBy("");
		customer.setAuthorizedDate(null);
		customer.setAuthorizedBy("");
		
		iCustomerDao.savedata(customer);
		
	}

	@Override
	public boolean deleteData(Customer customer) {
		
		boolean status=iCustomerDao.deletedata(customer);
		
		return status;
		
	}

	@Override
	public List<Customer> retrieveData() {
		return iCustomerDao.retrievedata();
	}

	@Override
	public Customer retrievedDataBy(String customerCode) {
		return iCustomerDao.retrievedataby(customerCode);
	}

	@Override
	public boolean updateData(Customer customer) {
		customer.setRecordStatus("M");
		boolean status=iCustomerDao.updatedata(customer);
		return status;
	}

	
		
		
	

}
