package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterDouble implements Counter {
	
	private int counter;
	private static CounterDouble cs;
	
	private CounterDouble()
	{
		counter = 1;
	}
	
	public static CounterDouble getInstance()
	{
		if (cs == null)
			cs = new CounterDouble();
		return cs;
	}	
	
	public void increment()
	{
		counter = counter * 2;
	}
	
	public int getCounter()
	{
		return counter;
	}
}
