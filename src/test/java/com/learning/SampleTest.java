package com.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testProgram() {
		String someWorld = "World";

		Assert.assertEquals("World", someWorld);
	}

}
