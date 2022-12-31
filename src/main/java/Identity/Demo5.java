package Identity;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo5 {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000/pim/10";
		RequestSpecification httpreq=RestAssured.given();
		
		Response resp=httpreq.get();
		String res=resp.body().asString();
		
		JsonPath path=new JsonPath(res);
		
		System.out.println(path.getString("morepersonalDetails.Education.Degree[1]"));
		System.out.println(path.getString("morepersonalDetails.Address.City[1]"));
		System.out.println(path.getString("morepersonalDetails.DOB"));
		System.out.println(path.getString("morepersonalDetails.Education.Project.Client"));
		
		
		
		
		
		
		
	}

}
