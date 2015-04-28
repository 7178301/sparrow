package nest;

/*
 * Nest Class
 * Created by Lara
 * 
 * Main module of Library. TBM
 * 
 */

import api.*;

public class Nest{
	Drone drone;

	public Boolean flyTo(Position destination) {
		if (drone.ready==true){
			if (destination.Altitude!=drone.Position.Altitude)
				changeAltitude(destination.Altitude);
			/************************************************************/
			//how do we actually fly? :/ 
			/************************************************************/
			return true;
		}
		else
			return false;
	}

	public Boolean takeOff(double altitude) {
		if (drone.ready==true){
			// Get motors ready, start up, take off to reach the point of altitude.
			// Check altitude before starting.
			return true;
		}
		else
			return false;
	}
	
	public Boolean land(double speed) {
		// Check the speed, hover for a bit, reduce altitude till land.
		// Shutting the motors down (?)
		return null;
	}

	public Boolean hover(long milsec){
		try{
			wait(milsec);
			return true;
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public String takePhoto() {
		// 1. Check camera. 
		// 2. if okay, try taking a photo.
		// 3. Store the photo.
		// 4. send back location of storage
		return null;
	}

	public double getAltitude() {
		// Read altitude, return it.
		return (Double) null;
	}

	public Boolean setHome(Position p) {
		// make a milestone, call it home.
		return null;
	}

	public double distanceToHome() {
		// get home, get place, what's the distance? use 3d geometry
		return (Double) null;
	}

	public Boolean flyHome() {
		// flyTo method using home point. 
		return null;
	}

	public Boolean changeAltitude(double altitude) {
		// check motors, check whether it should go up or down, ascend or descend respectively
		return null;
	}
}
