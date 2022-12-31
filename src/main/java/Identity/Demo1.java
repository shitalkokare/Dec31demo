package Identity;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000/employee/3";
		RequestSpecification httpreq=RestAssured.given();
		Response resp=httpreq.get();
		String res=resp.body().asString();
		//System.out.println(res);
		
		JsonPath path=new JsonPath(res);
		System.out.println(path.getInt("id"));
		System.out.println(path.getString("fname"));
		
		
		
		
		
		
		
		
	}

}
