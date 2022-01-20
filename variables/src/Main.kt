
fun main() {
    // Using "var"
    var a: String = "initial"
    println("var (a): $a")
    a = "modified value"
    println("var (a): $a")

    var e: Int
    //Variable 'e' must be initialized
    //println(e)

    // Using "val"
    val b: Int = 1
    println("val (b): $b")
    //Val cannot be reassigned
    //b = 2
    println("val (b): $b")
    val c = 3
    println("val (c): $c")

    val d: Int

    //Variable 'd' must be initialized
    //println("val (d): $d")

    if (someCondition()) d = 1 else d = 2

    println("val (d): $d")
}

fun someCondition(): Boolean = true
