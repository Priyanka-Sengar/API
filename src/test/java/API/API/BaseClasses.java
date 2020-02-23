package API.API;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseClasses {
	@BeforeClass
	public void baseSetUp()
	{
		RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication";
		
		

	}

}
