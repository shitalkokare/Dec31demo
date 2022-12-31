package Tutorial3;

import java.io.IOException;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		
	RestAssured.baseURI="http://localhost:3000";	
	RequestSpecification httpreq=RestAssured.given();	
	
	//how to request content type header in json format	
	httpreq.contentType(ContentType.JSON);
	
//	Employeepojo emp=new Employeepojo();
//	emp.setAddress("dubai");
//	
//	ObjectMapper mapper =new ObjectMapper();
//	String req=mapper.writeValueAsString(emp);
//		
//	httpreq.body(req);
	JSONObject json =new JSONObject();
	json.put("fname", "Sushil");

	httpreq.body(json.toString());

	
	Response resp=httpreq.patch("/employees/2");
	
	System.out.println(resp.statusCode());
	System.out.println(resp.statusLine());
	System.out.println(resp.body().asString());	
		
		
		
		
	}

}
