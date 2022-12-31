package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Demo6 {

	public static void main(String[] args) {
		
	//specify baseuri
		RestAssured.baseURI="http://localhost:3000";
	//get request specification object
	RequestSpecification httpreq=RestAssured.given();	
	
	for(int i=5;i<=9;i++)
	{
	
	Response resp=httpreq.delete("/employees/" +i);
	System.out.println(resp.statusCode());
	System.out.println(resp.statusLine());	
	System.out.println(resp.body().asString());	
		resp.headers();
	}	
		
		
		
		
		
	}

}
