package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	
	
	private static Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	public void createAccount(Integer key, Account account) {
		accountMap.put(key, account);
	}
	
	public static Integer generateKey() {
		Integer intKey = accountMap.size()+1;
		return intKey;
	}
	
	public void retrieveAcct(Integer key) {
		
		for (Map.Entry entry : accountMap.entrySet()) {
			if (entry.getKey() == key){
				System.out.println("Key " + entry.getKey()+" " + entry.getValue());
			}
		}
		
		
	}
	

}
