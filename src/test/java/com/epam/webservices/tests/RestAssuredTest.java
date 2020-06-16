package com.epam.webservices.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.epam.webservices.model.get.Get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest {

	@BeforeTest
	public void initTest() {
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
	}
	
	@Test
	public void checkStatusCode() {
		Response response = RestAssured.when()
										.get("/users")
										.andReturn();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void checkResponseHeader() {
		Response reponse = RestAssured.when()
										.get("/users")
										.andReturn();
		String rpContentTypeHeader = reponse.getHeader("Content-Type");
		Assert.assertEquals(rpContentTypeHeader, "application/json; charset=utf-8");
	}
	
	@Test
	public void checkResponseBody() {
		Response reponse = RestAssured.when()
									.get("/users")
								    .andReturn();
		ResponseBody<?> responseBody = reponse.getBody();
		Get[] users = responseBody.as(Get[].class);
		Assert.assertEquals(users.length, 10);
		
	}
	
}
