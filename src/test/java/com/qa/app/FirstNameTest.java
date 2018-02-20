package com.qa.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FirstNameTest {
	
	Service testserve = new Service();
	Account account1 = new Account("Brendan", "Greene");
	Account account2 = new Account("Theresa", "Jones");
	Account account3 = new Account("Ian", "Cunnigham");
	Account account4 = new Account("Brendan", "Cunnigham");
	
	@Before
	public void setUp() {
		testserve.createAccount(Service.generateKey(), account1);
		testserve.createAccount(Service.generateKey(), account2);
		testserve.createAccount(Service.generateKey(), account3);
		testserve.createAccount(Service.generateKey(), account4);
	}
	

	@Test
	public void testforfirstname() {
		
		int count1 = testserve.getcountforname("Brendan");
		assertEquals(2, count1);
		System.out.println(count1);
		int count2 = testserve.getcountforlastname("Cunnigham");
		assertEquals(2, count2);
		
	}
	
	//@Test
	//public void testforlastname() {
	//	int count2 = testserve.getcountforlastname("Cunnigham");
	//	assertEquals(2, count2);
	//}

}
