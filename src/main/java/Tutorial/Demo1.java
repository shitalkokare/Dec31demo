package Tutorial;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		
		//step 1:- specify base URI
		RestAssured.baseURI="http://localhost:3000/employees";
		
		//get request specificatioc object
		RequestSpecification httpreq=RestAssured.given();
		
		//hit get request
		Response resp=httpreq.get();
		
		//capture status code
//		int a=resp.getStatusCode();
//		System.out.println(a);
		
		int a1=resp.statusCode();
		System.out.println(a1);
		
		//capture status line
//				String b=resp.getStatusLine();
//				System.out.println(b);
				
				String b1=resp.statusLine();
				System.out.println(b1);
				
				//capture responce body or response payload
				String c=resp.getBody().asString();
				System.out.println(c);
//				String c1=resp.body().asString();
//				System.out.println(c1);
				
				//capture headers
				Headers header=resp.getHeaders();	
				
				for(Header abc:header)
				{
					System.out.println(abc.getName()+"  "+abc.getValue());
				}
				System.out.println(" ====================================== ");
				Headers header1=resp.headers();
				for(Header xyz:header1)
				{
					System.out.println(xyz.getName()+"  " +xyz.getValue());
				}
		
		
	}

}
