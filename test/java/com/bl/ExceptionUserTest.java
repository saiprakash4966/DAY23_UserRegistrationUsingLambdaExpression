package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserTest
{
	ExceptionUser exUS = new ExceptionUser();

	@Test
	/**
	 * created method givenLastName_IsProper_ReturnTrue() for true condition
	 */
	public void givenLName_IsProper_ReturnTrue() 
	{
		/**
		 * calling LName method to see last name is valid or not
		 */
		boolean actualResult = exUS.LName("Advani");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenLName_IsProper_ReturnFalse() for false condition
	 */
	public void givenLName_IsProper_ReturnFalse() {
		boolean actualResult = exUS.LName("advani");
		Assert.assertEquals(false, actualResult);
	}
}