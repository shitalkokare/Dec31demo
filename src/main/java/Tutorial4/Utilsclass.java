package Tutorial4;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Utilsclass {

	public static String requestEmployeePayeload(String empName,String deptName,String deptManager,String deptTeamLeader) throws IOException
	{
		Pojoclass p=new Pojoclass();
		p.setEmpName(empName);
		p.setDeptName(deptName);
		p.setDeptManager(deptManager);
		p.setDeptTeamLeader(deptTeamLeader);
		
		ObjectMapper mapper=new ObjectMapper();
		return mapper.writeValueAsString(p);
	}
	
	
	
	
	
	
	
}
