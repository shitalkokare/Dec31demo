package Tutorial4;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqREsLogSimple {

	public static void main(String[] args) throws IOException {
		
		
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpreq=RestAssured.given().log().all();//request log
		httpreq.contentType(ContentType.JSON);
		String reqbody=Utilsclass.requestEmployeePayeload("shital", "testing","samir", "jaohn");
		
		//how to add request body or payload	
		Response resp=httpreq.body(reqbody).when().post("/employee").then().log().all().extract().response();
																			//response log				
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());
		
		
		
		
		
		
	}

}
