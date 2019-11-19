package com.LST.Utils;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import io.restassured.response.Response;

public class ResponseParser {

	public String getResponseStatusCode(Response response){
		return "";
	}

	public String getResponseStatusMsg(Response response){
		return "";
	}


	public static String getID(Response response){


		Gson gson = new Gson();

		ResponsePOJO responseObj = null;

		responseObj = gson.fromJson(response.getBody().asString(), ResponsePOJO.class);

		String id = responseObj.getId();


		return id;
	}

	public static String getName(Response response){


		Gson gson = new Gson();

		ResponsePOJO responseObj = null;

		responseObj = gson.fromJson(response.getBody().asString(), ResponsePOJO.class);

		String name = responseObj.getName();


		return name;
	}

	public static String getJob(Response response){


		Gson gson = new Gson();

		ResponsePOJO responseObj = null;

		responseObj = gson.fromJson(response.getBody().asString(), ResponsePOJO.class);

		String job = responseObj.getJob();


		return job;
	}

	public static String getCreatedAt(Response response){


		Gson gson = new Gson();

		ResponsePOJO responseObj = null;

		responseObj = gson.fromJson(response.getBody().asString(), ResponsePOJO.class);

		String createdAt = responseObj.getCreatedAt();


		return createdAt;
	}

}
