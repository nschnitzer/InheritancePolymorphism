package Government;

public abstract class Government 
{
	String role;
	String name;
	boolean isElected;
	
	//Default Constructor
	public Government()
	{
		role = "Waste taxpayer money";
		name = "United States";
		boolean isElected = true;
	}
	public Government(String r, String n, boolean elected)
	{
		role = r;
		name = n;
		isElected = elected;
	}
	
	public void setRole(String r)
	{
		role = r;
		return;
	}
	
	public void setName(String name)
	{
		this.name = name;
		return;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getElectedStatus()
	{
		return isElected;
	}

}
