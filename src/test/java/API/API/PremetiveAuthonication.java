package API.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PremetiveAuthonication extends BaseClasses{
	@Test
	public void authentication()
	{
		Response response=RestAssured.given().get();
		System.out.println(response.body().jsonPath().prettify());
		JsonPath jsonPath=response.jsonPath();
		System.out.println(jsonPath);
		
		
	}


}
