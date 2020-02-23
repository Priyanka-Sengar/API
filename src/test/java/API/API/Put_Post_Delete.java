package API.API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_Post_Delete {
	@Test
	public void post()
	{
		//		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpresquest=RestAssured.given();
		//		httpresquest.request(Method.GET, "http://localhost:3000/posts");
		httpresquest.header("Content-Type","application/json");
		JSONObject js=new JSONObject();
		js.put("id","24");
		js.put("title","json-server11");
		js.put("author","typicode6523465");
		httpresquest.request(js.toJSONString());
		Response response=	httpresquest.put( "http://localhost:3000/posts");//response interface
		System.out.println(response.getStatusCode());

	}


}
