package com.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testProgram() {
		String someWorld = "Worlds";

		Assert.assertEquals("World", someWorld);
	}

}
