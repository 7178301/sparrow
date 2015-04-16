![Alt text](http://g.gravizo.com/g?
  class Accelerometer {}
  class Altometer {}
  class Camera {}
  class Compass {}
  class Gyroscope {}
  class LIDAR {}
  class RPLIDAR {}

/**
*@composed 1 - 1 Accelerometer
*@composed 1 - 1 Altometer
*@composed 1 - 1 Camera
*@composed 1 - 1 Compass
*@composed 1 - 1 Gyroscope
*@composed 1 - 1 LIDAR
*@composed 1 - 1 RPLIDAR
*/
  class SensorModule {}




  class AndroidModule {}




  class DJIPhantom2SDK {}
  class FlyverSDK {}

/**
*@composed 1 - 1 DJIPhantom2SDK
*/
  class DJIPhantom2Adapter {}

/**
*@composed 1 - 1 FlyverSDK
*/
  class FlyverAdapter {}

/**
*@composed 1 - 1 DJIPhantom2Adapter
*@composed 1 - 1 FlyverAdapter
*/
  class SDKInterfaceModule {}




  class ManualFlight {}
  class AutomatedFlight {}




/**
*@composed 1 - 1 ManualFlight
*@composed 1 - 1 AutomatedFlight
*/
  class Mapping {}

  class TestFlightSamples {}
  class SavedRoutes {}
  class NavigationInterface {}

/**
*@composed 1 - 1 NavigationInterface
*@composed 1 - 1 Mapping
*@composed 1 - 1 SavedRoutes
*@composed 1 - 1 TestFlightSamples
*/
  class NavigationModule {}




/**
*@composed 1 - 1 SensorModule
*@composed 1 - 1 AndroidModule
*@composed 1 - 1 SDKInterfaceModule
*@composed 1 - 1 NavigationModule
*/
  class Sparrow {}
)