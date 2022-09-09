package com.testng;

import org.testng.annotations.DataProvider;

public class Data_Provider1 {
	@DataProvider
	private String[][] test_Data() {
		String name[][] = { 
				{ "Starc", "Mic" }, 
				{ "Barath", "Barath@998" }, 
				{ "SharmiKutty", "Barath" } 
				}; 

		return name;
	}

}
