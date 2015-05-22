package api;

/*
 * Drone Interface
 * Created by Lara
 * 
 * Interface for Drone adaptor
 * 
 */

public interface Drone {
	boolean ready = false;
	Position position = null;
	double minSpeed = 0;
	double maxSpeed = 0;
	
	void init();
	boolean linearFlyTo(double latitude, double longtitude, double speed); 
	boolean linearFlyTo(double latitude, double longtitude); 
	boolean changeAltitude(double altitude,double speed);
	boolean changeAltitude(double altitude);
	double getSpeed();
	void shutDown();
}


//What if a drone needs to constantly update its position?