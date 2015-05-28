package de.htw_berlin.ai_bachelor.kbe.counter;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterFactoryTest {

	
	@Test
	public void instanceCounterSimpleTest() {
		Counter ins = CounterFactory.getCounterInstance("simple");
		assertEquals(ins.getClass(), CounterSimple.class);
	}

	@Test
	public void instanceCounterDoubleTest() {
		Counter ins = CounterFactory.getCounterInstance("double");
		assertEquals(ins.getClass(), CounterDouble.class);
	}

	@Test
	public void instanceCounterTripleTest() {
		Counter ins = CounterFactory.getCounterInstance("triple");
		assertEquals(ins.getClass(), CounterTriple.class);
	}
	
	@Test 
	public void instanceNullTest() {
		Counter ins = CounterFactory.getCounterInstance("bulls");
		assertEquals(ins, null);
	}
}
