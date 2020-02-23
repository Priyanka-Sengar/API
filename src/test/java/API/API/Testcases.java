package API.API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Testcases {

	@Test
	public void getAllUSer() throws IOException
	{
		// Initializing Rest API's URL
		//String APIUrl = "https://restapi.demoqa.com/customer/register";
		String APIUrl = "https://reqres.in/api/users"; 
		

		// Initializing payload or API body
		//String APIBody = "{\"FirstName\" : \"Himani\", \"LastName\" : \"Sengar1\", \"UserName\" : \"Himani.sengar1\", \"Password\" : \"Priya09@\", \"Email\" : \"himanisengar01@gmail.com\"}";
		// e.g.-
		// "{\"key1\":\"value1\",\"key2\":\"value2\"}"
		String APIBody = "{\"avatar\" : \"Himani\",\"last_name\" : \"sengar\", \"first_name\" : \"Priya\", \"email\" : \"himanisengar01@gmail.com\"}";
		

		// Making post request with authentication, leave blank in case there
		// are no credentials- basic("","")
		ValidatableResponse response = RestAssured.given().when().header("Content-Type","application/json").body(APIBody)
				.post(APIUrl).then();
		System.out.println(response.extract().asString());
		response.statusCode(201);
		response.contentType(ContentType.JSON);
		response.body( "SuccessCode" ,Matchers.containsString("OPERATION_SUCCESS") );
		// Fetching param


		// Asserting that capital of Norway is Oslo

	}







}
