import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Travel(PointOfDeparture : String, Destination: String, DepartureDate : String, DepartureTime : String, TravelTime : Int) : AbstractTravel(PointOfDeparture,
    Destination,DepartureDate, DepartureTime, TravelTime ){
    override  suspend fun F2(n : Int) {
        runBlocking {
            repeat(n) {
                launch {
                    delay(1000)
                    do {
                        println("Введи время поездки в минутах: ")
                        TravelTime = readLine()!!.toInt()
                        if (TravelTime <= 0) println("Неправильный ввод повторите попутку")
                    } while (TravelTime <= 0)
                    println("Время поездки будет состовлять $TravelTime минут")
                }
            }
        }
    }
}