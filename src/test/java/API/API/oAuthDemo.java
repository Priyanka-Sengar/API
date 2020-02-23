package API.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class oAuthDemo {
	@Test
	public static String Test1()
	{
		Response response=RestAssured.given().formParam("client_id", "MyApiTest")
				.formParam("client_secret", "46225cabe3bbe2b997c914cb6bd102e5")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");
		System.out.println(response.jsonPath().prettify());
		String token =response.jsonPath().get("access_token");
		return token;
	}
}
