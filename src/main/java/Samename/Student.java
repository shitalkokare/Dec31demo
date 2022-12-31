package Samename;

import java.util.List;

public class Student {

	private final int roll = 0;
	private final String name = "";
	private final List<Subject> subjects = null;
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subjects=" + subjects + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		return true;
	}	
	
	
	
	
	
	
	
	
}
