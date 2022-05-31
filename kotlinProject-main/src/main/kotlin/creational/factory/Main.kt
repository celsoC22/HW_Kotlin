package creational.factory

object Main {
    // Purchased Items
    @JvmStatic
    fun main(args: Array<String>) {

        //Car Factory
        val factory = CarFactory()
        for (i in 0..2) {
            val car = factory.randomCar()
            car.purchasedCar()


        }
    }
}
