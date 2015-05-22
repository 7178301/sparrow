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
	Position home;

	public Boolean flyTo(Position destination,double speed) {//default speed?
		if (drone.ready==true){
			if (destination.altitude!=drone.position.altitude)
				drone.changeAltitude(destination.altitude);//callback?
			drone.linearFlyTo(destination.latitud, destination.longtitude);
			return true;
		}
		else
			return false;
	}

	public Boolean takeOff(double altitude) {
		if (drone.ready==true){
			drone.changeAltitude(altitude,drone.minSpeed);
			return true;
		}
		else
			return false;
	}
		
	public Boolean land(double speed) {
		hover(2000);
		//change the altitude for the following
		drone.changeAltitude(home.altitude,drone.minSpeed);//lands in the same altitude as it took off from.
		drone.shutDown();
		return null;
	}

	public Boolean hover(long milsec){
		try{
			wait(milsec);
			//Can we somehow bring the speed to zero?
			return true;
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	//how to say if a drone is capable of taking photos or not?
	public String takePhoto() {
		// 1. Check camera. 
		// 2. if okay, try taking a photo.
		// 3. Store the photo.
		// 4. send back location of storage
		return null;
	}

	public double getAltitude() {
		// Read altitude, return it.
		return drone.position.altitude;
	}

	public Boolean setHome(Position p) {
		// make a milestone, call it home.
		try{
			this.home=p;
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	//this needs work
	public double distanceToHome() {
		//use geometry?
		return 0;
	}

	public Boolean flyHome(double speed) {
		flyTo(home, speed); 
		return null;
	}
	
	public boolean start(){
		try{
			drone.init();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
		
	};

}
