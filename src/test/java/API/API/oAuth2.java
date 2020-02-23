package API.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class oAuth2 {
	@Test
	public void Autho2()
	{
		
		Response response=RestAssured.given().auth().oauth2(oAuthDemo.Test1()).post("http://coop.apps.symfonycasts.com/api/USER_ID/eggs-collect");
		System.out.println(response.body().asString());
	}

}
