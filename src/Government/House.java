package Government;

public class House extends Legislative
{
	private int numMembers;
	private String committees;
	
	public House()
	{
		super(true, 432);
		numMembers = 0;
	}
	
	public House(int n, String c)
	{
		super(true, n);
		numMembers = n;
		committees = c;
	}
	
	public House(int n)
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
