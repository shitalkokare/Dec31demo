package Identity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudSubAdd {

	public static void main(String[] args) throws IOException {
		
		Subjects subject=new Subjects();
		subject.setFirstYear("Java");
		subject.setSecodYear("Selenium");
		subject.setThirdyear("BDDFramework");
		
		 Address addres=new Address();
		addres.setStreet("baramati");
		addres.setCity("pune");
		addres.setState("MH");
		addres.setCountry("India");
		addres.setCity("mumbai");
		
		Students stud=new Students();
		stud.setId(10);
		stud.setsName("shital");
		stud.setAddress(addres);	
		stud.setSubjects(subject);
		
		ObjectMapper mapper=new ObjectMapper();
		String abc=mapper.writeValueAsString(stud);
		System.out.println(abc);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
