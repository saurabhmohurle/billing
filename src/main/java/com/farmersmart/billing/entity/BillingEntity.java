package com.farmersmart.billing.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bill")
public class BillingEntity {
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@javax.persistence.Id
	private int id;
	private int customerId;
	private String name;
	private String paymentMode;
	private long phone;
	private String address;
	private int pincode;
	/**
	 * 
	 */
	public BillingEntity() {
		super();
	}
	/**
	 * @param id
	 * @param customerId
	 * @param name
	 * @param paymentMode
	 * @param phone
	 * @param address
	 * @param pincode
	 */
	public BillingEntity(int id, int customerId, String name, String paymentMode, long phone, String address,
			int pincode) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.name = name;
		this.paymentMode = paymentMode;
		this.phone = phone;
		this.address = address;
		this.pincode = pincode;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "BillingEntity [id=" + id + ", customerId=" + customerId + ", name=" + name + ", paymentMode="
				+ paymentMode + ", phone=" + phone + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
		
	
}
