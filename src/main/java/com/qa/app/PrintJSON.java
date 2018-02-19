package com.qa.app;

import org.json.JSONObject;

public class PrintJSON {
	
	public void printMapAsJSON() {
		try {
			JSONObject json = new JSONObject(Service.accountMap);
			System.out.println("This is my 'accoutnMap' Hashmap as JSON:  "+json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printMapAsJSON(Account acc) {
		try {
			JSONObject json = new JSONObject(acc);
			System.out.println("This is an Account from 'accoutnMap' Hashmap as JSON:  "+json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
