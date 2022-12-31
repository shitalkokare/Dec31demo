package Identity;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000/employee/2";
		RequestSpecification httpreq=RestAssured.given();
		
		Response resp=httpreq.get();
		String res=resp.body().asString();
		
		JsonPath path=new JsonPath(res);
		System.out.println(path.getString("empName"));
		System.out.println(path.getString("deptDetails.deptTeamLeader"));
		System.out.println(path.getString("city"));
		System.out.println(path.getString("deptDetails.deptName"));
		
	}

}
