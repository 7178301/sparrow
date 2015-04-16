![Alt text](http://g.gravizo.com/g?
@startuml;
object Sparrow

object SensorModule
object AndroidModule
object SDKInterfaceModule
object NavigationModule

object Accelerometer
object Altometer
object Camera
object Compus
object Gyroscope
object LIDAR
object RPLIDAR

object DJIPhantom2Adapter
object FlyverAdapter
object DJIPhantom2SDK
object FlyverSDK

object NavigationInterface
object Mapping
object SavedRoutes
object TestFlightSamples
object ManualFlight
object AutomatedFlight

Sparrow .. SensorModule
Sparrow .. AndroidModule
Sparrow .. SDKInterfaceModule
Sparrow .. NavigationModule

SensorModule .. Accelerometer
SensorModule .. Altometer
SensorModule .. Camera
SensorModule .. Compus
SensorModule .. Gyroscope
SensorModule .. LIDAR
SensorModule .. RPLIDAR

SDKInterfaceModule .. DJIPhantom2Adapter
SDKInterfaceModule .. FlyverAdapter
DJIPhantom2Adapter .. DJIPhantom2SDK
FlyverAdapter .. FlyverSDK

NavigationModule .. NavigationInterface
NavigationModule .. Mapping
NavigationModule .. SavedRoutes
NavigationModule .. TestFlightSamples
Mapping .. ManualFlight
Mapping .. AutomatedFlight

@enduml
)