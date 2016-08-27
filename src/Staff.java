import java.util.Date;


public class Staff extends Employee implements EmployeeInfo {

	public Staff()
	{
		this("", "", "", ' ', new Date(), 0);
	}
	
	public Staff(String lastName, String firstName, String id, char gender, Date birthday, double hourlyRate)
	{
		super(lastName, firstName, id, gender, birthday);
		mHourlyRate = hourlyRate;
	}
	
	public double monthlyEarning()
	{
		return mHourlyRate * STAFF_MONTHLY_HOURS_WORKED;
	}
	
	public String toString() 
	{
		return super.toString() + "\nFull time\nMonthly salary : $" + monthlyEarning();
	}
	
	public double getHourlyRate()
	{
		return mHourlyRate;
	}
	
	public void setHourlyRate(double hourlyRate)
	{
		mHourlyRate = hourlyRate;
	}
	
	public String priorSuperString ()
	{
		return super.toString();
	}
	
	private double mHourlyRate;

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
