package API.API;

import javax.swing.text.AbstractDocument.Content;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.PreemptiveAuthSpec;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class getRequest {
	@Test
	public void getDate()
	{
		RestAssured.baseURI="https:/reqres.in/api/users";
		RequestSpecification htttprequest=RestAssured.given();
		Response response=htttprequest.request(Method.GET,"?page=2");
		PreemptiveBasicAuthScheme data1=new PreemptiveBasicAuthScheme();
		data1.setUserName("Priyanka.Sengar");
		data1.setPassword("Priyanka1");
		
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		String data=response.getStatusLine().toString();
		System.out.println("Data"+data);
		RestAssured.given().when().get("https:/reqres.in/api/users?page=2").then().assertThat().header("Content-Type", "application/json");
		JSONObject object =new JSONObject();
		object.put("firstName", "Priyanka");
		object.put("LastName","Sengar");
		object.put("email_Id","priyankasengar09@gmail.com");
		
		
		
		
		
		
	}

}
