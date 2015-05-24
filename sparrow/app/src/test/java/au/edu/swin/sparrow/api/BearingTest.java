package au.edu.swin.sparrow.api;

import au.edu.swin.sparrow.api.sdkInterface.positioning.Bearing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

//@Config(manifest = "../app/src/main/AndroidManifest.xml")
public class BearingTest
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
