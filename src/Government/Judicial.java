package Government;

public abstract class Judicial extends Government
{
	String[] judges;
	
	public Judicial()
	{
		super("Uphold the laws in court", "Judicial System", false);
	}
	
	public Judicial(String role, String name, String[] j)
	{
		super(role, name, false);
		judges = j;
	}
	
	public String[] getJudges()
	{
		return judges;
	}

}
