package API.API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PUTMETHOD {
	@Test
	public void test1()
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json=new JSONObject();

		Object data=json.put("first_name", "cerulean236");
		System.out.println("Added email"+data);
		json.put("last_name", "2018");
		request.body(json.toJSONString());
		Response response=request.post("https://reqres.in/api/users/2");
		int code =response.getStatusCode();
		Object s=response.andReturn();
		System.out.println(code);
		//		System.out.println(res);
		System.out.println(s);


	}

}
