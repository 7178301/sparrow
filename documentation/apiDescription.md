#Drone API Design

We provide an Interface class that all modules must implement.

We should provide some kind of version checking, so that as the API is updated, the modules are still usable.

##Data Types
All standard measurement types are incorporated.  
Units only have to be entered in one standard and internal conversions will apply them appropriately.
###Position Types
![Alt text](http://g.gravizo.com/g?
  interface Position {
  	private double longitude;
  	private double latitude;
  	private double altitude;
  	public double getLongitude();
  	public double getLatitude();
  	public double getAltitude();
  }
  class RelativePosition extends Position {
  	public RelativePosition add(RelativePosition b);
  	public RelativePosition minus(RelativePosition b);
  }
  class AbsolutePosition extends Position {
  	public AbsolutePosition add(RelativePosition b);
  	public AbsolutePosition minus(RelativePosition b);
  	public RelativePosition minus(AbsolutePosition b);
  }
)
###Bearing Type
![Alt text](http://g.gravizo.com/g?
  class Bearing {
  	Bearing(double);
  	String toString() //output degrees minutes seconds
  	Bearing add(Bearing b)
  }
)
###Examples

- Speed
	- 	km/h
	- 	knots
	- 	miles/hour
- Distance
	- 	feet
	- 	metres
- Bearing
	- 	degrees

###SDK Interface Module (Drone Interface)
![Alt text](http://g.gravizo.com/g?
  interface DroneAPI {
        static private int apiVersion;
        public int getAPIVersion();
        public void flyTo(Position pos, Bearing bear, Double speed);
        public void takeOff(Position pos);
        public void land(Position pos);
        public void wait(Double time);
  }
)
###Camera Interface Module
![Alt text](http://g.gravizo.com/g?
  interface CameraAPI {
	void initCamera();
	void takePhoto();
  }
)
###Range Finder Interface Module
![Alt text](http://g.gravizo.com/g?
  interface RangeFinder {
	void initRangeFinder();
	double getDistance(Bearing direction);
  }
)
