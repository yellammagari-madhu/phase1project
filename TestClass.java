package AnnotationsAssignment.Listener;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.class)
public class TestClass {

	@Test
	public void testOne() {
		assertTrue(true);
	}
	
	@Test
	public void testTwo() {
		assertTrue(false);
	}
}



