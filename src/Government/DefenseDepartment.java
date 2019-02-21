package Government;

public class DefenseDepartment extends Executive
{
	int nukes;
	int troops;
	String HQ;
	public DefenseDepartment()
	{
		super();
		nukes = 1000;
		troops = 200000000;
		HQ = "Pentagon";
	}
	
	public DefenseDepartment(int n, int t, String headquarters)
	{
		nukes = n;
		troops = t;
		HQ = headquarters;
	}
	
	public int getNukes()
	{
		return nukes;
	}
	
	public int getTroops()
	{
		return troops;
	}
	
	public String getGarrison()
	{
		return HQ;
	}

}
