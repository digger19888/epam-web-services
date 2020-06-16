package com.epam.webservices.tests;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.webservices.model.get.Get;

public class RestTemplTest {

	@Test
	public void checkStatusCode() {
		RestTemplate restTeample = new RestTemplate();
		ResponseEntity<Get[]> response = restTeample.getForEntity("http://jsonplaceholder.typicode.com/users", Get[].class);
		int actStatusCode = response.getStatusCode().value();
		Assert.assertEquals(actStatusCode, 200);
	}
	
	@Test
	public void checkResponseHeader() {
		RestTemplate restTeample = new RestTemplate();
		ResponseEntity<Get[]> response = restTeample.getForEntity("http://jsonplaceholder.typicode.com/users", Get[].class);
		HttpHeaders headers = response.getHeaders();
		
		String actContentTypeValue = headers.getContentType().toString();		
		Assert.assertEquals(actContentTypeValue, "application/json;charset=utf-8");
	}
	
	@Test()
	public void checkResponseBody() {
		RestTemplate restTeample = new RestTemplate();
		ResponseEntity<Get[]> response = restTeample.getForEntity("http://jsonplaceholder.typicode.com/users", Get[].class);
		Get[] actUsers = response.getBody();
		
		Assert.assertEquals(actUsers.length, 10);
	}
	
	
}
