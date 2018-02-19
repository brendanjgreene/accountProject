package com.qa.app;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AccountServiceTest {
	private Service service;
	private Account JohnBloggs;
	private Account JaneBlogs;
	private Account JohnGordon;

	@Test
	public void test() {
		service = new Service();
		JohnBloggs = new Account("John", "Bloggs");
		JaneBlogs = new Account("John", "Bloggs");
		JohnGordon = new Account("John", "Gordon");
		
		/*public void getCountForFirstNameInAccount("John") {
			
			Assert.assertEquals(service.getAccountForFirstName("John"), 0);
			service.createAccount(service.generateKey(), JohnBloggs);
			Assert.assertEquals(service.getAccountForFirstName("John"), 1);
			service.createAccount(service.generateKey(), JaneBlogs);
			Assert.assertEquals(service.getAccountForFirstName("John"), 1);
			service.createAccount(service.generateKey(), JohnGordon);
			Assert.assertEquals(service.getAccountForFirstName("John"), 2);
		}*/
		
	}

}
