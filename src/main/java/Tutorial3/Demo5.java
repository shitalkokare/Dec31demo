package Tutorial3;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo5 {

	public static void main(String[] args) throws IOException {
	//specify base URI
	RestAssured.baseURI="http://localhost:3000";	
	//get request specification object
	RequestSpecification httpreq=RestAssured.given();
	//add request content type header in json format
	httpreq.contentType(ContentType.JSON);
	
	Emppojo emp=new Emppojo();
	emp.setFname("mahi");
	emp.setLname("khanna");
	emp.setAddress("london");
	emp.setMobileNo("9987654322");
	emp.setEmailId("mahi@gmail.com");	
	
 //convert java obj into json obj by using jakson data bind dependency
// then we create request data by using pojo class
	
	ObjectMapper mapper=new ObjectMapper();
		String req=mapper.writeValueAsString(emp);
		
	//add serialization object as a part of request payload or request body	
		httpreq.body(req);
	//hit put req
		Response resp=httpreq.put("/employees/1");
	//capture
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());
		resp.headers();
		
		
	}

}
