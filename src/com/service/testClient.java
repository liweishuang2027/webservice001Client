package com.service;

public class testClient {
	public static void main(String[] args) {
		HelloWebService test = new HelloWebServiceService().getHelloWebServicePort();
		System.out.println(test.sayHello("123"));
	}

}
