package com.farmersmart.billing.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.billing.entity.BillingEntity;
import com.farmersmart.billing.service.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {
	private static final Logger logger = LoggerFactory.getLogger(BillingController.class);
	
	@Autowired
	BillingService service;
	
	//BillingEntity billingentity;
	String response;
	
	@PostMapping("/addBilling")
	public String addBilling(@RequestBody BillingEntity entity) {
		service.addBilling(entity);
		response = "Added successfully"; 
		logger.info(response);
		return response;
	}
	@PutMapping("/updateBilling")
	public String updateBilling(@RequestBody BillingEntity entity) {
		service.updateBilling(entity);
		response = "Billing update successfully";
		logger.info(response);
		return response;
	}
	@GetMapping("/getBilling")
	public List<BillingEntity> getBilling(){
		
		return service.getBilling();
	}
	@GetMapping("/getBillingById")
	public Optional<BillingEntity> getBillingById(@RequestParam int id){
		return service.getBillingById(id);
	}
	@GetMapping("/getBillingByCustomerId")
	public List<BillingEntity> getBillingByCustomerId(@RequestParam int customerId){
		return service.getBillingByCustomerId(customerId);
	}
	@GetMapping("/getBillingByCustomerName")
	public List<BillingEntity> getBillingByName(@RequestParam String name){
		return service.getBillingByName(name);
	}
	@GetMapping("/getBillingByCustomerPhone")
	public List<BillingEntity> getBillingByPhone(@RequestParam long phone){
		return service.getBillingByPhone(phone);
	}
	@DeleteMapping("/deleteBillingById")
	public String deleteBillingById(@RequestParam int id) {
		service.deleteBillingById(id);
		//logger.info(response);
		//response ="Id no: "+id+" deleted successfully";
		//return response;
		return "Deleted successfully";
	}
}
