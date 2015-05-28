package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterFactory 
{
	private CounterFactory()
	{
	}
	
	public static Counter getCounterInstance(String typ)
	{
		Counter c = null;
		if (typ.equals("simple"))
			c = CounterSimple.getInstance();
		else if (typ.equals("double"))
			c = CounterDouble.getInstance();
		else if (typ.equals("triple"))
			c = CounterTriple.getInstance();
		return c;
	}
}
