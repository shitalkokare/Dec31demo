package Identity;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000/students/1";
		RequestSpecification httpreq=RestAssured.given();
		
		Response resp=httpreq.get();
		String res=resp.body().asString();
		
		JsonPath path=new JsonPath(res);
		System.out.println(path.getInt("id"));
		System.out.println(path.getLong("mobileNo"));
		System.out.println(path.getString("Address.street"));
		System.out.println(path.getString("subjects.thirdyear"));
	}

}
