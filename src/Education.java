
public class Education implements EmployeeInfo, Cloneable {

	public Education()
	{
		this("", "", 0);
	}
	
	public Education (String degree, String major, int researches)
	{
		mDegree = degree;
		mMajor = major;
		mResearches = researches;
	}
	
	public String getDegree()
	{
		return mDegree;
	}
	
	public String getMajor ()
	{
		return mMajor;
	}
	
	public int getResearches() 
	{
		return mResearches;
	}
	
	public void setDegree(String degree)
	{
		mDegree = degree;
	}
	
	public void setMajor (String major)
	{
		mMajor = major;
	}
	
	public void setResearches (int researches)
	{
		mResearches = researches;
	}
	
	public String toString()
	{
		return "\nDegree: " + mDegree + "\nMajor: " + mMajor + "\nResearch: " + mResearches;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	private String mDegree;
	private String mMajor;
	private int mResearches;
}
