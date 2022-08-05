package com.test.MavenProjectCustomer;



public class Customer {
	private int id;
	private String name;
	private int purchaseAmount;
	private int age;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public Customer(int id, String name, int purchaseAmount, int age) {
		super();
		this.id = id;
		this.name = name;
		this.purchaseAmount = purchaseAmount;
		this.age = age;
	}
}


