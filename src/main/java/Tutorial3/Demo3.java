package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpreq=RestAssured.given();
		
		Response resp=httpreq.delete("/employees/1");
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());
		Headers header=resp.headers();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
