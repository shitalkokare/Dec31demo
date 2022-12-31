package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
	
		//specify base URi
		RestAssured.baseURI="http://localhost:3000/employees";
		//get req specification object
		RequestSpecification httpreq=RestAssured.given();
		//hit get req
		Response resp=httpreq.get();
		//capture status code
		int a=resp.statusCode();
		System.out.println(a);
		
		
		//capture status line
		String b=resp.statusLine();
		System.out.println(b);
		
		//capture response body or response payload
		
		String c1=resp.body().asString();
		System.out.println(c1);
		
	
		Headers hed1=resp.headers();
		for(Header abc:hed1)
		{
			System.out.println(abc.getName()+ "  " +abc.getValue());
		}
		
		
		
		
	}

}
