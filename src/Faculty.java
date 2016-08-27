import java.util.Date;


public class Faculty extends Employee implements Cloneable {
	
	public Faculty()
	{
		this ("", "", "", ' ', new Date(), "", new Education());
	}
	
	public Faculty(String lastName, String firstName, String id, char gender, Date bdate, String level, Education e)
	{
		super(lastName, firstName, id, gender, bdate);
		mLevel = level;
		mEducation = e;
	}
	
	public String toString ()
	{
		String level;
		if (mLevel.equals("AS"))
			level = "Assistant ";
		else if (mLevel.equals("AO"))
			level = "Associate";
		else 
			level = "Full";
		return super.toString() + "\n" + level + " Professor" + "\nMonthly Salary: $" + monthlyEarning();
	}
	
	public double monthlyEarning() 
	{
		if (mLevel.equals("AS"))
			return FACULTY_MONTHLY_SALARY;
		else if (mLevel.equals("AO"))
			return FACULTY_MONTHLY_SALARY * 1.2;
		else
			return FACULTY_MONTHLY_SALARY * 1.4;
	}
	
	public String getLevel ()
	{
		return mLevel;
	}
	
	public Education getEducation()
	{
		return mEducation;
	}
	
	public void setLevel (String level)
	{
		mLevel = level;
	}
	
	public void setEducation (Education e)
	{
		mEducation = e;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Faculty f1 = (Faculty)super.clone();
		Education e2 = (Education)mEducation.clone();
		f1.setEducation(e2);
		return f1;
	}
	
	
	private String mLevel;
	private Education mEducation;
	@Override
	
	public int compareTo(Employee o) {
		return this.mIDNumber.compareTo(o.mIDNumber);
	}

	public int compareTo(String o) {
		return this.mIDNumber.compareTo(o);
	}

}
