package com.qa.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameTest {
	
	Service testserve = new Service();
	Account account1 = new Account("Brendan", "Greene");
	Account account2 = new Account("Theresa", "Jones");
	Account account3 = new Account("Ian", "Cunnigham");
	Account account4 = new Account("Brendan", "Cunnigham");
	

	@Test
	public void testforfirstname() {
		
		testserve.createAccount(Service.generateKey(), account1);
		testserve.createAccount(Service.generateKey(), account2);
		testserve.createAccount(Service.generateKey(), account3);
		testserve.createAccount(Service.generateKey(), account4);
		
		int count = testserve.getcountforname("Brendan");
		assertEquals(2, count);
		
		System.out.println(count);
		
		
	}

}
