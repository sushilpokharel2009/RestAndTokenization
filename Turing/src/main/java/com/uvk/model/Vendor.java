package com.uvk.model;

public class Vendor {
	
	private int id;
//	private String name;
//	private String phoneNumber;
//	private String address;
//	private String email;
//	private String checkNumber;
	private String accountNumber;
	private String routingNumber;
	private String tableName;
	
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
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
	/*
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the routingNumber
	 */
	public String getRoutingNumber() {
		return routingNumber;
	}
	/**
	 * @param routingNumber the routingNumber to set
	 */
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", accountNumber=" + accountNumber + ", routingNumber=" + routingNumber
				+ ", tableName=" + tableName + "]";
	}
	
	
	
}
