package Government;

public class Senate extends Legislative
{
	private int numMembers;
	private String committees;
	
	public Senate()
	{
		super(true, 6);
		numMembers = 0;
	}
	
	public Senate(int n, String c)
	{
		numMembers = n;
		committees = c;
	}
	
	public Senate(int n)
	{
		numMembers = 0;
		committees = "NONE";
	}
	
	public int getNumMembers()
	{
		return numMembers;
	}
	
	public String getCommittees()
	{
		return committees;
	}

}
