package Government;

public class SupremeCourt extends Judicial
{
	private Object[] cases;
	public SupremeCourt()
	{
		super();
	}
	
	public SupremeCourt(String role, String[] justices, Object[] cases)
	{
		super(role, "Supreme Court", justices);
		this.cases = cases;
	}
	
	public Object[] getCases()
	{
		return cases;
	}


}
