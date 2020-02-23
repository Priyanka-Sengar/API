package API.API;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteMethod {

	@BeforeClass
	public void setBaseUri () {

		RestAssured.baseURI = "https://reqres.in/api";
	}


	@Test
	public void deleteTest () {

		given()
		.when ()
		.contentType (ContentType.JSON)
		.delete ("/users/9");

	}
}


