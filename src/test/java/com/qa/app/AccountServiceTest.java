package com.qa.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AccountServiceTest {
	private Service service;
	private Account JohnBloggs;
	private Account JaneBloggs;
	private Account JohnGordon;

	@Before
	public void setUp() {
		service = new Service();
		JohnBloggs = new Account("John", "Bloggs");
		JaneBloggs = new Account("Jane", "Bloggs");
		JohnGordon = new Account("John", "Gordon");
	}
	
	@Test
	public void test() {
			
		assertEquals(service.getAccountForFirstName("John"), 0);
		service.createAccount(Service.generateKey(), JohnBloggs);
		assertEquals(service.getAccountForFirstName("John"), 1);
		service.createAccount(Service.generateKey(), JaneBloggs);
		assertEquals(service.getAccountForFirstName("John"), 1);
		service.createAccount(Service.generateKey(), JohnGordon);
		assertEquals(service.getAccountForFirstName("John"), 2);
		assertEquals(service.getcountforlastname("Bloggs"), 2);
	
	}
	
}
