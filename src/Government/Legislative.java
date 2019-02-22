package Government;

public abstract class Legislative extends Government
{
	
	boolean appointed;
	int term;
	
	public Legislative()
	{
		super("Decide how to spend funds", "Legislative Branch", true);
		appointed = true;
		term = 4;
	}
	
	public Legislative(boolean a, int t)
	{
		appointed = a;
		term = t;
	}
	
	public boolean isAppointed()
	{
		return appointed;
	}
	
	public int getTerm()
	{
		return term;
	}
	
	public abstract int getNumMembers();

}
