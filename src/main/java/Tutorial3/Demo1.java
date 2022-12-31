package Tutorial3;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) throws IOException {
	//how to specify baseURI
	RestAssured.baseURI="http://localhost:3000";	
	RequestSpecification httpreq=RestAssured.given();
	//how to request content type header in json format
	httpreq.contentType(ContentType.JSON);
	
	Employeepojo employee=new Employeepojo();
	employee.setFname("sakshi");
	employee.setLname("mane");
	employee.setAddress("pune");	
	employee.setMobileNo("987654332");	
	employee.setEmailId("sakshi@gmail.com");	
	//System.out.println(employee);	
	ObjectMapper mapper=new ObjectMapper();
	String req=mapper.writeValueAsString(employee);
	
	//how to add request body or payload	
	httpreq.body(req);
	//hit put request
	Response resp=httpreq.put("/employees/2");
	
	System.out.println(resp.statusCode());
	System.out.println(resp.statusLine());
	
	
	System.out.println(resp.body().asString());
	Headers abc=resp.headers();
	
		
		
	}

}
