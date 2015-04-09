#Drone API Design

We provide an Interface class that all modules must implement.

We should provide some kind of version checking, so that as the API is updated, the modules are still usable.

##Data Types
All standard measurement types are incorporated.  
Units only have to be entered in one standard and internal conversions will apply them appropriately.

###Examples

- Speed
	- 	km/h
	- 	knots
	- 	miles/hour
- Distance
	- 	feet
	- 	metres
- Bearing
	- 	degrees (Decimal)
	- 	degrees/minutes/seconds

##Modules
###Root Class

This is the class that the end user will use. There will need to be a way to choose the module, and this should do the version checking.


####Attributes:
	Modules
		we store the type of module here, so we can use it.
####Methods:
	enableModule(Module)
		Turns a particular module on for system runtime
	setModule(Module)
		Sets an attribute within a module  
###Configeration Module (Drone Interface)
####Attributes:
	getAPIVersion
		returns the API version running on the drone.  (Compatibility of features safeguard)
####Methods:
	getVersionNumber()
		returns the version number  
###Navigation Module
This should be a basic coordinate, and should be usable with both relative positions and GPS positions. Should be possible to do basic addition/subtraction arithmetic on the coordinate as well. 
####Attributes
	- altitude
	- longitude
	- latitude
	- heading
####Methods
	takeOff()
		makes the drone lift up 3 feet and hover on the spot til ready  
	land()
		forces the drone to land  
	flyTo()
		flys to a given coordinate
###Sensor Module
####Attributes
####Methods
	enableCamera()
		enable or disable camera  
	enableRangeSensor()
		the range sensors, even amongst the same drone the sensors might be different  
###Mapping Module
####Attributes
####Methods
###Android Module
####Attributes
####Methods