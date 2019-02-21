package Government;

public class NinthCircuit extends Judicial
{
	private Object[] cases;
	public NinthCircuit()
	{
		super();
	}
	
	public NinthCircuit(String role, String[] judges, Object[] cases)
	{
		super(role, "Ninth Circuit", judges);
		this.cases = cases;
	}
	
	public Object[] getCases()
	{
		return cases;
	}

}
