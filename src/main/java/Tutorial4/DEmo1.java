package Tutorial4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DEmo1 {

	public static void main(String[] args) throws IOException {
		
		RestAssured.baseURI="http://localhost:3000";
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		PrintStream logs=new PrintStream (fos);
		RequestSpecification httpreq=RestAssured.given()
				.filter(RequestLoggingFilter.logRequestTo(logs))
				.filter(ResponseLoggingFilter.logResponseTo(logs));
		
			
		for(int i=6;i<=9;i++)
		{
		Response resp=httpreq.when().delete("/employee/" +i).then().extract().response();
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
