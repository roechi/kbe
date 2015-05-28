package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterTriple implements Counter {
	
	private int counter;
	private static CounterTriple cs;
	
	private CounterTriple()
	{
		counter = 1;
	}
	
	public static CounterTriple getInstance()
	{
		if (cs == null)
			cs = new CounterTriple();
		return cs;
	}	
	
	public void increment()
	{
		counter = counter * 3;
	}
	
	public int getCounter()
	{
		return counter;
	}
}
