package com.nucleus.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.dao.CustomerDaoImpl;
import com.nucleus.model.Customer;
import com.nucleus.service.ICustomerService;





@Controller
public class CustomerController {
	
	private static final Logger logger = Logger.getLogger(CustomerController.class);
	@Autowired
	ICustomerService iCustomerService;
	

/************************************************************create******************************************************************	*/
	@RequestMapping("/ccreateform")
	public ModelAndView createForm(Customer customer)
	{
		return new ModelAndView("createform"); 
		
	}
	
	@RequestMapping("/cdisplayform")
	public ModelAndView displayForm(@Valid Customer customer, BindingResult result,Principal principal)
	{
		if(result.hasErrors())
		{	
			logger.info("Error at server side in create");
			return new ModelAndView("createform","status","not insert"); 
			
			
		}
		
		else{
		
		customer.setCreatedBy(principal.getName());
		iCustomerService.saveData(customer);
		return new ModelAndView("displayform","customer",customer);
		
		}
}
	/************************************************************create******************************************************************	*/

	/**************************************************Retrieve All*************************************************/
	@RequestMapping("/cretieveAll")
	public String retieveAll(Model model)
	{
		List<Customer>list=iCustomerService.retrieveData();
		model.addAttribute("list",list);
		return "retrieveAll";
		
	}
	/**************************************************Retrieve All*************************************************/
	
	/**************************************************Retrieve By*************************************************/
	
	@RequestMapping("/cretieveBy1")
	public ModelAndView retieveBy1(Customer customer)
	{
		return new ModelAndView("retrieveBy1");
		
	}
	
	@RequestMapping(value="/cretrieveby2", method=RequestMethod.POST)
	public ModelAndView retieveBy2(@RequestParam("customerCode") String customerCode,Model model)
	{
		Customer cust=iCustomerService.retrievedDataBy(customerCode);
		
		if(cust==null)
		{
			model.addAttribute("statusretrieve", "No entry found....");
			return new ModelAndView("retrieveBy1");
		}
		return new ModelAndView("retrieveBy2","customer",cust);
		
	}
	
	/**************************************************Retrieve By*************************************************/

	/**********************update*****************************************************************/
	@RequestMapping("/cupdateBy1")
	public String updateForm(Customer customer)
	{
		return "updateBy1";
		
	}
	@RequestMapping("/cupdateBy2")
	public ModelAndView updateForm1(@RequestParam("customerCode") String customerCode,Model model)
	{
		Customer cust=iCustomerService.retrievedDataBy(customerCode);
		if(cust==null)
		{
			model.addAttribute("statusupdate","No entry found");
			return new ModelAndView("updateBy1");
		}
		return new ModelAndView("updateBy2","customer",cust);
	
}
	@RequestMapping("/cupdateBy3")
	public ModelAndView updateForm2(@Valid Customer customer, BindingResult result,Model model,Principal principal)
	{
		if(result.hasErrors())
		{
			logger.info("Error at server side in update");
			return new ModelAndView("updateBy2"); 
		}
		customer.setModifiedBy(principal.getName());
		
		boolean status=iCustomerService.updateData(customer);
		if(status)
		{
			
			model.addAttribute("statusupdate","Record Updated");
			return new ModelAndView("displayform","customer",customer);
		}
		else {
			model.addAttribute("statusupdate","Record updation failed.");
			return new ModelAndView("displayform","customer",customer);
		}
		
	}


	/**********************update*****************************************************************/

	/**********************delete*****************************************************************/
	@RequestMapping("/cdeleteForm")
	public String deleteForm()
	{
		return "deleteForm";
		
	}
	
	@RequestMapping("/cdeleteForm1")
	public ModelAndView deleteForm1(Customer customer,Model model)
	{
		
		boolean status=iCustomerService.deleteData(customer);
		if(status)
		{
			model.addAttribute("statusdelete1","record deleted");
			return new ModelAndView("deleteForm");
		}
		else
		{
			model.addAttribute("statusdelete1", "No entry found....");
			return new ModelAndView("deleteForm");

		}
	}
	
	/**********************delete*****************************************************************/



	










}




