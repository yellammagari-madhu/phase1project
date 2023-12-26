package test.testng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class calculator {

	@Test
	
	public void addIntegerNumbers()
	{
		Calculator1 myCalculator = new Calculator1();
		int expected= 30;
		int actual= myCalculator.add(10,20);
		Assert.assertEquals(actual, expected);
	}
}

