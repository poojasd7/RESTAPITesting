package dummy.restexample.scripts;

import org.testng.annotations.Test;

import com.LST.Utils.RequestPOJO;
import com.LST.Utils.*;

import com.google.gson.Gson;
import io.restassured.response.Response;

public class TestDummy {

	@Test
	public void testGETDummy(){
		RestAssuredAPI restAssured = new RestAssuredAPI("https://reqres.in");
		
		restAssured.GET( "/api/users/2");
		
	}
	
	@Test
	public void testPOSTDummy(){
		
		RequestPOJO req = new RequestPOJO();
/*		dummy.setAge("2");
		dummy.setName("Shalu");
		dummy.setSalary("10000");*/
		
		req.setName("Shalmali");
		req.setJob("Officer");
		
		Gson gson = new Gson();
		String body = gson.toJson(req,RequestPOJO.class);

		RestAssuredAPI restAssured = new RestAssuredAPI("https://reqres.in");
		
		System.out.println("Body is:"+body);
		
		Response response = restAssured.POST(body, "/api/users");
		
		System.out.println("Id is:"+ResponseParser.getID(response));
		System.out.println("Name is:"+ResponseParser.getName(response));
		System.out.println("Job is:"+ResponseParser.getJob(response));
		System.out.println("CreatedAt is:"+ResponseParser.getCreatedAt(response));
		
	}
	
	@Test(enabled=false)
	public void testPUTDummy(){
		
		RequestPOJO req = new RequestPOJO();
/*		dummy.setAge("2");
		dummy.setName("Shalu");
		dummy.setSalary("10000");*/
		
		req.setName("Shalu");
		req.setJob("CCC");
		
		Gson gson = new Gson();
		String body = gson.toJson(req,RequestPOJO.class);

		RestAssuredAPI restAssured = new RestAssuredAPI("https://reqres.in");
		
		System.out.println("Body is:"+body);
		
		restAssured.POST(body, "/api/users");
		
	}
	
}
