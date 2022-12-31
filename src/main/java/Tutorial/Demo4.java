package Tutorial;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		
	RestAssured.baseURI="http://localhost:3000";	
	RequestSpecification httpreq=RestAssured.given();	
	httpreq.contentType(ContentType.JSON);
	EmployeePojo employee =new EmployeePojo();
	employee.setFname("samir");
	employee.setLname("kokare");	
	employee.setAddress("pune");	
	employee.setMobileNo("98776767565");	
	employee.setEmailId("samir@gmail.com");	
		
	ObjectMapper mapper=new ObjectMapper();
	String a=mapper.writeValueAsString(employee);
	httpreq.body(a);
	Response resp=httpreq.post("/employees");
	System.out.println(resp.statusCode());
	System.out.println(resp.statusLine());
		String b=resp.body().asString();	
		System.out.println(b); 
		
		
		
		
		
		
		
		
		
	}

}
