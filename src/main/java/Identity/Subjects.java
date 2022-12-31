package Identity;

public class Subjects {

	private String firstYear;
	private String secodYear;
	private String thirdyear;
	
	public String getFirstYear() {
		return firstYear;
	}
	public void setFirstYear(String firstYear) {
		this.firstYear = firstYear;
	}
	public String getSecodYear() {
		return secodYear;
	}
	public void setSecodYear(String secodYear) {
		this.secodYear = secodYear;
	}
	public String getThirdyear() {
		return thirdyear;
	}
	public void setThirdyear(String thirdyear) {
		this.thirdyear = thirdyear;
	}
	@Override
	public String toString() {
		return "Subject [firstYear=" + firstYear + ", secodYear=" + secodYear + ", thirdyear=" + thirdyear + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstYear == null) ? 0 : firstYear.hashCode());
		result = prime * result + ((secodYear == null) ? 0 : secodYear.hashCode());
		result = prime * result + ((thirdyear == null) ? 0 : thirdyear.hashCode());
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
		Subjects other = (Subjects) obj;
		if (firstYear == null) {
			if (other.firstYear != null)
				return false;
		} else if (!firstYear.equals(other.firstYear))
			return false;
		if (secodYear == null) {
			if (other.secodYear != null)
				return false;
		} else if (!secodYear.equals(other.secodYear))
			return false;
		if (thirdyear == null) {
			if (other.thirdyear != null)
				return false;
		} else if (!thirdyear.equals(other.thirdyear))
			return false;
		return true;
	}
	public Subjects() {
		super();
		}
	
		
		
		
		
		


}
