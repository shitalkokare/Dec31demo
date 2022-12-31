package Samename;

import java.util.List;

public class Report {

	 private final List<Student> student=null;

	public List<Student> getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "Report [student=" + student + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		Report other = (Report) obj;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
