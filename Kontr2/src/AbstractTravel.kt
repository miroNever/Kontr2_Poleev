import kotlinx.coroutines.*
abstract class AbstractTravel(var PointOfDeparture : String,var Destination: String,var DepartureDate : String,var DepartureTime : String,var TravelTime : Int): InterfaceTravel {

    override suspend fun F1() {
        println("Поезд идет со станции $PointOfDeparture по станцию $Destination")
        println("Дата отправления : $DepartureDate")
        println("Время отправления : $DepartureTime")
        println("Время пути : $TravelTime")
    }
    abstract override suspend fun F2(n : Int)
}