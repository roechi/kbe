package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterSimple implements Counter
{	
	private int counter;
	private static CounterSimple cs;
	
	private CounterSimple()
	{
		counter = 0;
	}
	
	public static CounterSimple getInstance()
	{
		if (cs == null)
			cs = new CounterSimple();
		return cs;
	}
	
	public void increment()
	{
		counter++;
	}
	
	public int getCounter()
	{
		return counter;
	}
}
