package au.edu.swin.sparrow.api;

import junit.framework.TestCase;

import au.edu.swin.sparrow.api.sdkInterface.positioning.GPSPosition;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

//@Config(manifest = "../app/src/main/AndroidManifest.xml")
public class GPSPositionTest extends TestCase{

	@Test
	public void testToString() {
		GPSPosition rp = new GPSPosition(1.23, 2.34, 3.45);
		assertEquals("Longitude: 1.23, Latitude: 2.34, Altitude: 3.45", rp.toString());
	}
	
}
