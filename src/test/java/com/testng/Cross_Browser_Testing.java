package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.RunnerClass.UtilityFiles1;

public class Cross_Browser_Testing extends UtilityFiles1 {
	public static WebDriver driver;

	@Test
	private void adactin() {
		// TODO Auto-generated method stub
		driver = getBrowser("Chrome");
		getUrl("https://adactinhotelapp.com/index.php");
	}

	@Test
	private void facebook() {
		// TODO Auto-generated method stub
		driver = getBrowser("edge");
		getUrl("https://www.facebook.com/login/");
	}
}
