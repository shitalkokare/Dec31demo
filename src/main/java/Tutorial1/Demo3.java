package Tutorial1;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Tutorial.EmployeePojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {
public static void main(String[] args) throws IOException {
	
	RestAssured.baseURI="http://localhost:3000";
	RequestSpecification httpreq=RestAssured.given();
	httpreq.contentType(ContentType.JSON);
	
	EmployeePojo employee=new EmployeePojo();
	employee.setFname("shital");
	employee.setLname("kokare");
	employee.setAddress("pune");
	employee.setEmailId("kokares@gmail.com");
	employee.setMobileNo("9876554322");
	
	ObjectMapper mapper=new ObjectMapper();
	String abc=mapper.writeValueAsString(employee);
	Response resp=httpreq.body(abc).post("/employees");
	
	System.out.println(resp.body().asString());
	
	
	
}
}
