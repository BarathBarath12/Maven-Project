package com.testng;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Api_Get {
	@Test
	private void get() {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response response = req.get("/api/users?page=2");
		String asString = response.asString();
		System.out.println(asString);
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
	}

//	@Test
//	private void post() {
//		// TODO Auto-generated method stub
//		RestAssured.baseURI = "https://reqres.in/";
//		RequestSpecification req = RestAssured.given();
//	RequestSpecification body = req.body("{\r\n" + 
//			"    \"name\": \"morpheus\",\r\n" + 
//			"    \"job\": \"leader\"\r\n" + 
//			"}");
//		Response response = body.post("/api/users");
//		String asString = response.asString();
//		System.out.println(asString);
//		String statusLine = response.getStatusLine();
//		System.out.println(statusLine);
//	}
//	@Test
//	private void put() {
//		// TODO Auto-generated method stub
//		RestAssured.baseURI = "https://reqres.in/";
//		RequestSpecification req = RestAssured.given();
//	RequestSpecification body = req.body("{\r\n" + 
//			"    \"name\": \"barath\",\r\n" + 
//			"    \"job\": \"kumar\"\r\n" + 
//			"}");
//		Response response = body.put("/api/users/2");
//		String asString = response.asString();
//		System.out.println(asString);
//		String statusLine = response.getStatusLine();
//		System.out.println(statusLine);
//	}
//	@Test
//	private void delete() {
//		// TODO Auto-generated method stub
//		RestAssured.baseURI = "https://reqres.in/";
//		RequestSpecification req = RestAssured.given();
//	RequestSpecification body = req.body("{\r\n" + 
//			"    \"name\": \"barath\",\r\n" + 
//			"    \"job\": \"kumar\"\r\n" + 
//			"}");
//		Response response = body.delete("/api/users/2");
//		String asString = response.asString();
//		System.out.println(asString);
//		String statusLine = response.getStatusLine();
//		System.out.println(statusLine);
//	}
}
