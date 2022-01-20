open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")
class Brazilian(name: String, origin: String = "Brazilian") : Lion(name = name, origin = origin)

fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
    val brazilianLion: Lion = Brazilian("Pele", "French")
    brazilianLion.sayHello()
    val otherBrazilianLion: Lion = Brazilian("Tiao")
    otherBrazilianLion.sayHello()
}