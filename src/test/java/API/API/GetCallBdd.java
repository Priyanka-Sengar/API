package API.API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetCallBdd {
	@Test
	public void test_numberOfCircuitsfor3_Limit()
	{
	given().when().get("http://ergast.com/api/f1?limit=30.json").then().assertThat().statusCode(200)
	.header("Content-Type", "application/json");	
	}

}
