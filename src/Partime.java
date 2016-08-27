import java.util.Date;


public class Partime extends Staff implements EmployeeInfo {
	
	public Partime ()
	{
		this("", "", "", ' ', new Date(), 0, 0);
	}
	
	public Partime (String lastName, String firstName, String id, char gender, Date birthday, double hourlyRate, int hrs)
	{
		super(lastName, firstName, id, gender, birthday, hourlyRate);
		mHoursWorkedPerWeek = hrs;
	}
	
	public String toString()
	{
		return super.priorSuperString() + "\nHours worked per week: " + mHoursWorkedPerWeek + "\nMonthly Salary: $" + monthlyEarning(); 
	}
	
	public int getHoursWorkedPerWeek()
	{
		return mHoursWorkedPerWeek;
	}
	
	public void setHoursWorkedPerWeek(int hrs)
	{
		mHoursWorkedPerWeek = hrs;
	}
	
	public double monthlyEarning()
	{
		return super.getHourlyRate() * mHoursWorkedPerWeek * 4;
	}
	
	private int mHoursWorkedPerWeek;

}
