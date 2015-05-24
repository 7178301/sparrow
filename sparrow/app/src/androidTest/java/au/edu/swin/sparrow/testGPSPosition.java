package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sdkInterface.GPSPosition;
import sdkInterface.RelativePosition;

public class testGPSPosition {

	@Test
	public void testToString() {
		GPSPosition rp = new GPSPosition(1.23, 2.34, 3.45);
		assertEquals("Longitude: 1.23, Latitude: 2.34, Altitude: 3.45", rp.toString());
	}
	
}
