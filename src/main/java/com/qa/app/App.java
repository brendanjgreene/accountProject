package com.qa.app;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Account Account1 = new Account("Brendan", "Greene");
		Account Account2 = new Account("Theresa", "Jones");
		Account Account3 = new Account("Ian", "Cunnigham");
		
		Service newService = new Service();
		newService.createAccount(1, Account1);
		newService.createAccount(2, Account2);
		newService.createAccount(Service.generateKey(), Account3);
		Account Account4 = new Account("Medb", "Greene");
		newService.createAccount(Service.generateKey(), Account4);
		newService.retrieveAcct(1);
		newService.retrieveAcct(2);
		newService.retrieveAcct(3);
		PrintJSON newJson = new PrintJSON();
		newJson.printMapAsJSON();
		newJson.printMapAsJSON(Account2);
		newJson.printMapAsJSON(Account4);

	}

}
