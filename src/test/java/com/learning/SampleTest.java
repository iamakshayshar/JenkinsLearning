package com.learning;

import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testProgram() {
		String someWorld = "World";

		if ("World".equalsIgnoreCase(someWorld)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
	}

}
