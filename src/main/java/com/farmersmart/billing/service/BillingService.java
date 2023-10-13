package com.farmersmart.billing.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmersmart.billing.entity.BillingEntity;
import com.farmersmart.billing.entity.BillingRepository;

@Service
public class BillingService {
	private static final Logger logger = LoggerFactory.getLogger(BillingService.class);
	
	@Autowired
	BillingRepository repository;
	
	//BillingEntity billingentity;

	public String addBilling(BillingEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		return "Saved successfully";
	}

	public String updateBilling(BillingEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		return "Updated successfully";
	}

	public List<BillingEntity> getBilling() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Optional<BillingEntity> getBillingById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public List<BillingEntity> getBillingByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return repository.getBillingByCustomerId(customerId);
	}

	public List<BillingEntity> getBillingByName(String name) {
		// TODO Auto-generated method stub
		return repository.getBillingByName(name);
	}

	public List<BillingEntity> getBillingByPhone(long phone) {
		// TODO Auto-generated method stub
		return repository.getBillingByPhone(phone);
	}

	public String deleteBillingById(int id) {
		// TODO Auto-generated method stub
		String message;
		try {
		repository.deleteById(id);
		message = "Customer deleted successfully";
		logger.info(message);
		}catch (Exception e) {
			
			// TODO: handle exception
			message = "Invalid Id: "+id;
			logger.error(message);
		}
		return message;
	}
	
}
