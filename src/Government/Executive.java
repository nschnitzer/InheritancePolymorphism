package Government;

public abstract class Executive extends Government
{
	
	public Executive()
	{
		super();
		super.setRole("Collect Taxes");
	}
	
	public Executive(String role)
	{
		super();
		super.role = role;
	}
	
	public void setRole(String r)
	{
		role = r;
	}
	
	public String getRole()
	{
		return role;
	}

}
