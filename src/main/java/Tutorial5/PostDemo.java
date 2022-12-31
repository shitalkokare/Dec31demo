package Tutorial5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostDemo {

	public static void main(String[] args) throws IOException  {

		RestAssured.baseURI="http://localhost:3000";
		FileOutputStream fos=new FileOutputStream("abc.txt");
		PrintStream logs=new PrintStream(fos);
		RequestSpecification httpreq=RestAssured.given()
				.filter(RequestLoggingFilter.logRequestTo(logs))
				.filter(ResponseLoggingFilter.logResponseTo(logs));
				
		httpreq.contentType(ContentType.JSON);
		
		String req=UtilsClass.requestPayload("sakshi", "testing", "dubai", "john");
		System.out.println("=====================================");		
		//add requestpayload or body
		Response resp=httpreq.body(req).when().post("/employee").then().extract().response();
		
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
