package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sdkInterface.Bearing;

public class testBearing 
{

	@Test
	public void testBearingToString() 
	{
		Bearing temp = new Bearing(40.34722);
		assertEquals("40\u00B020'50\"", temp.toString());
		
		temp = new Bearing(30);
		assertEquals("30\u00B0", temp.toString());
		
		temp = new Bearing(-30);
		assertEquals("330\u00B0", temp.toString());
		
		temp = new Bearing(1050);
		assertEquals("330\u00B0", temp.toString());
		
	}

}
