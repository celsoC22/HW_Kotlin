package creational.factory

import java.util.*
import creational.factory.cars.*

class CarFactory {
    fun makeCar(name: String?): Cars {
        return when (name) {
            "OUTLANDER" -> Mitsubishi()
            "FORTUNER" -> Toyota()
            "GT-R" -> Nissan()
            else -> OtherCar()
        }
    }

    fun randomCar(): Cars {
        val rand = Random()
        val num = rand.nextInt(3)
        return when (num) {
            0 -> Mitsubishi()
            1 -> Toyota()
            2 -> Nissan()
            else -> OtherCar()
        }
    }


}
