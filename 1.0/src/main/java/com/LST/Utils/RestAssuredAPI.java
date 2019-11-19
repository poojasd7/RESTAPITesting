/**
 * 
 */
package com.LST.Utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * @author P7111602
 *
 */
public class RestAssuredAPI {

	String baseURL;
	
	public RestAssuredAPI(String baseURL){
		RestAssured.baseURI = baseURL;
		
	}
	
	
	public void GET(String urlPath){
		
		
		Response response =RestAssured
		.given()
		.accept(ContentType.JSON)
		.when()
		.get(urlPath)
		.then().extract().response();
		
		System.out.println("Status code:"+response.statusCode());
		System.out.println("Response of GET is:"+response.getBody().asString());
		
	}
	
	
	public void GETSpecific(String urlPath){
		
		
		Response response =RestAssured
		.given()
		.accept(ContentType.JSON)
		.when()
		.get(urlPath)
		.then().extract().response();
		
		System.out.println("Status code:"+response.statusCode());
		System.out.println("Response of GET is:"+response.getBody().asString());
		
	}
	
	public Response POST(String body, String urlPath){
		System.out.println("URL Path is: "+urlPath);
		Response response =RestAssured
				.given()
				.accept(ContentType.JSON) 
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.post(urlPath)
				.andReturn();
				
				System.out.println("Status code:"+response.statusCode());
				System.out.println("Shalu is present?:"+response.asString().contains("Shalu"));
				System.out.println("Response is:"+response.getBody().asString());
				
				return response;
				
	}
	
	public void PUT(String body, String urlPath){
		System.out.println("URL Path is: "+urlPath);
		Response response =RestAssured
				.given()
				.accept(ContentType.JSON) 
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(urlPath)
				.andReturn();
				
				System.out.println("Status code:"+response.statusCode());
				System.out.println("Shalu is present?:"+response.asString().contains("Shalu"));
	
	}
	
}
