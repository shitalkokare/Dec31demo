package Tutorial;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {
//com.googlecode.json-simple using simple json dependency
	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000/employees";
		RequestSpecification httpreq=RestAssured.given();
		 //1..httpreq.contentType(ContentType.JSON);
		 
		httpreq.header("Content-Type","application/json");
		JSONObject json=new JSONObject();
		json.put("fname", "shital");
		json.put("lname", "kokare");
		json.put("mobileNo", "87676546453");
		json.put("address", "baramati");
		json.put("emailId", "kokareshital@gmail.com");
		
		String reqbody=json.toString();
		Response resp=httpreq.body(reqbody).post();
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());
		//System.out.println(resp.headers());
		
		
		
		
		
		
		
		
		
		
		
	}

}
