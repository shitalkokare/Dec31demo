package Tutorial1;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000/employees";
		RequestSpecification httpreq=RestAssured.given();
		//how to add req content typ header
		httpreq.contentType(ContentType.JSON);
		
		JSONObject object=new JSONObject();
		object.put("fname", "sonali");
		object.put("lname", "yadav");
		object.put("mobileNo", "987665454353");
		object.put("address", "pune");
		object.put("emailId", "soanli@gmail.com");
		
		String reqbody=object.toString();
		Response resp=httpreq.body(reqbody).post();
		
		String abc=resp.body().asString();
		System.out.println(abc);
	
	
	}

}
