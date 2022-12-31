package Tutorial5;

public class Employeepojo {

	private int id;
	private String empName;
	private String deptName;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeptTeamLeader() {
		return deptTeamLeader;
	}
	public void setDeptTeamLeader(String deptTeamLeader) {
		this.deptTeamLeader = deptTeamLeader;
	}
	@Override
	public String toString() {
		return "Employeepojo [id=" + id + ", empName=" + empName + ", deptName=" + deptName + ", address=" + address
				+ ", deptTeamLeader=" + deptTeamLeader + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
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
		Employeepojo other = (Employeepojo) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
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
	public Employeepojo() {
		super();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
