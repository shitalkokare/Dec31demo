package Tutorial5;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilsClass {

	
	public static String requestPayload(String empName,String deptName,String address,String deptTeamLeade) throws IOException
	{
	
		Employeepojo emp=new Employeepojo();
		emp.setEmpName(empName);
		emp.setDeptName(deptName);
		emp.setAddress(address);
		emp.setDeptTeamLeader(deptTeamLeade);
		
		ObjectMapper mapper=new ObjectMapper();
		return mapper.writeValueAsString(emp);
		
	}
	
	
	
	
	
	
	
}
