package Tutorial3;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Patchreq {

	public static void main(String[] args) {
		
	//specify baseuri
	RestAssured.baseURI="http://localhost:3000";	
	//get request specification object
	RequestSpecification httpreq=RestAssured.given();
	//add content type header in json format
	httpreq.contentType(ContentType.JSON);
	
	//how to create request payload/ request body
	
	JSONObject json=new JSONObject();
	json.put("fname", "sarita");
	String req=json.toString();
	httpreq.body(req);
	
	//hit patch req
	Response resp=httpreq.patch("/employees/1");
		
	//capture
	System.out.println(resp.statusCode());
	System.out.println(resp.statusLine());	
	System.out.println(resp.body().asString());	
	resp.headers();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
