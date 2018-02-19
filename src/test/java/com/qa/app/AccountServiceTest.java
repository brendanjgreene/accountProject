package com.qa.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AccountServiceTest {
	private Service service;
	private Account JohnBloggs;
	private Account JaneBlogs;
	private Account JohnGordon;

	@Before
	public void setUp() {
		service = new Service();
		JohnBloggs = new Account("John", "Bloggs");
		JaneBlogs = new Account("Jane", "Bloggs");
		JohnGordon = new Account("John", "Gordon");
	}
	
	@Test
	public void test() {
			
		assertEquals(service.getAccountForFirstName("John"), 0);
		service.createAccount(Service.generateKey(), JohnBloggs);
		assertEquals(service.getAccountForFirstName("John"), 1);
		service.createAccount(Service.generateKey(), JaneBlogs);
		assertEquals(service.getAccountForFirstName("John"), 1);
		service.createAccount(Service.generateKey(), JohnGordon);
		assertEquals(service.getAccountForFirstName("John"), 2);
	
	}
	
}
