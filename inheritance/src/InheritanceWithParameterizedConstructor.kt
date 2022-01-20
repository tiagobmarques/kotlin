open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")
class BengalTiger : Tiger("India")

fun main() {
    val siberianTiger: Tiger = SiberianTiger()
    siberianTiger.sayHello()

    val bengalTiger: Tiger = BengalTiger()
    bengalTiger.sayHello()

    val africanTiger: Tiger = Tiger("Africa")
    africanTiger.sayHello()
}