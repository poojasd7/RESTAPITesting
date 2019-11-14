package dummy.restexample.scripts;

import org.testng.annotations.Test;

import com.LST.Utils.RestAssuredAPI;

public class TestDummy {

	@Test
	public void testGETDummy(){
		RestAssuredAPI restAssured = new RestAssuredAPI("http://dummy.restapiexample.com/api/v1");
		
		restAssured.GET( "/employees");
		
	}
	
}
