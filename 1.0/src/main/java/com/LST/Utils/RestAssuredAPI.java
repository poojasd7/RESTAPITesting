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
	
	
	public static void GET(String urlPath){
		
		
		Response response =RestAssured
		.given()
		.accept(ContentType.JSON)
		.when()
		.get(urlPath)
		.then().extract().response();
		
		System.out.println("Astuti is present?:"+response.asString().contains("Astuti"));
		
	}
	
	public void POST(){
		
	}
	
	public void PUT(){
		
	}
	
}
