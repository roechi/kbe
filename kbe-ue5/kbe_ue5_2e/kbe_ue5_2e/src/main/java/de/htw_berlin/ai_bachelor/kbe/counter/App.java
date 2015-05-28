package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String type = "triple";
        CounterFactory.getCounterInstance(type).increment();
        System.out.println("Counter: " + CounterFactory.getCounterInstance().getCounter());
    }
}
