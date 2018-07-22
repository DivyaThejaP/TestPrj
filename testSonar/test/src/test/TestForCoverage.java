package test;

import org.junit.Test;

public class TestForCoverage {
	@SuppressWarnings("static-method")
	@Test
	//(expected = IllegalArgumentException.class)
	public void mixItUp() {
		testCoverage.mthd1();
	}
}