package Tutorial4;

public class Pojoclass {

	private int id;
	private String empName;
	private String deptName;
	private String deptManager;
	private String deptTeamLeader;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptManager() {
		return deptManager;
	}
	public void setDeptManager(String deptManager) {
		this.deptManager = deptManager;
	}
	public String getDeptTeamLeader() {
		return deptTeamLeader;
	}
	public void setDeptTeamLeader(String deptTeamLeader) {
		this.deptTeamLeader = deptTeamLeader;
	}
	@Override
	public String toString() {
		return "Pojoclass [id=" + id + ", empName=" + empName + ", deptName=" + deptName + ", deptManager="
				+ deptManager + ", deptTeamLeader=" + deptTeamLeader + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptManager == null) ? 0 : deptManager.hashCode());
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + ((deptTeamLeader == null) ? 0 : deptTeamLeader.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pojoclass other = (Pojoclass) obj;
		if (deptManager == null) {
			if (other.deptManager != null)
				return false;
		} else if (!deptManager.equals(other.deptManager))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (deptTeamLeader == null) {
			if (other.deptTeamLeader != null)
				return false;
		} else if (!deptTeamLeader.equals(other.deptTeamLeader))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public Pojoclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
   	
    	
    	
    	
    	

}
