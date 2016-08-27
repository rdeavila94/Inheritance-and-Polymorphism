import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Employee implements EmployeeInfo, Comparable <Employee>{
	
	public Employee()
	{
		this ("", "", "", ' ', new Date());
	}
	
	public Employee (String lastName, String firstName, String id, char gender, Date birthday) 
	{
		mLastName = lastName;
		mFirstName = firstName;
		mIDNumber = id;
		mGender = gender;
		mBirthDate = birthday;
	}
	
	public String toString ()
	{
		return "ID Employee number: " + mIDNumber + "\nEmployee name: " + mLastName + ", " + mFirstName + "\nBirth date: " +
				df.format(mBirthDate);
	}
	
	public void setLastName (String lastName)
	{
		mLastName = lastName;
	}
	
	public void setFirstName (String firstName)
	{
		mFirstName = firstName;
	}
	
	public void setIDNumber(String ID)
	{
		mIDNumber = ID;
	}
	
	public void setGender (char gender)
	{
		mGender = gender;
	}
	
	public void setBirthdate (Date bday)
	{
		mBirthDate = bday;
	}
	
	public String getLastName ()
	{
		return mLastName;
	}
	
	public String getFirstName ()
	{
		return mFirstName;
	}
	
	public String getIDNumber ()
	{
		return mIDNumber;
	}
	
	public Date getBirthDate ()
	{
		return mBirthDate;
	}
	
	public char getGender ()
	{
		return mGender;
	}
	
	
	public abstract double monthlyEarning ();
	

	
	protected String mLastName, mFirstName, mIDNumber;
	private char mGender;
	private Date mBirthDate;
	private SimpleDateFormat df = new SimpleDateFormat ("MM/dd/yyyy");
}
