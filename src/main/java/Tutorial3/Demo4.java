package Tutorial3;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		
	//we specify baseURi
		RestAssured.baseURI="http://localhost:3000/employees";
	//get request specification object
		RequestSpecification httpreq=RestAssured.given();
	//add request content type header in json format
		httpreq.contentType(ContentType.JSON);
	//create pojo class object
		Emppojo emp=new Emppojo();
		emp.setFname("khushi");
		emp.setLname("shaha");
		emp.setAddress("Dubai");
		emp.setMobileNo("9988776655");
		emp.setEmailId("khushi@gmail.com");
		
	//convet java class into json  by using jackson-databind dependency
		//	then we create request data by using pojo class.
		
		ObjectMapper mapper=new ObjectMapper();	
		String req=mapper.writeValueAsString(emp);
		
	
	//	add serialization object as part of request payload or request bod
	//capture request body
		httpreq.body(req);
	//hit post request
		Response resp=httpreq.post();
	//capture status code,status line,response body,response headers
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());
		resp.headers();
		
		
		
		
		
	}

}
