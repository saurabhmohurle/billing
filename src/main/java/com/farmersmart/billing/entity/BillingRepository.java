package com.farmersmart.billing.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BillingRepository extends JpaRepository<BillingEntity, Integer>{
	public	List<BillingEntity> getBillingByCustomerId(int customerId);
	public List<BillingEntity> getBillingByName(String name);
	public List<BillingEntity> getBillingByPhone(long phone);

}
