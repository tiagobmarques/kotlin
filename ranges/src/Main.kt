fun main() {
    for(i in 0..3) {             // 1
        print(i)
    }
    println()
    println("-------------------------------------")

    for(i in 0 until 3) {        // 2
        print(i)
    }
    println()
    println("-------------------------------------")

    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    println()
    println("-------------------------------------")

    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    println()
    println("-------------------------------------")

    for (c in 'a'..'d') {        // 1
        print(c)
    }
    println()
    println("-------------------------------------")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    println()
    println("-------------------------------------")
    val x = 2
    if (x in 1..5) {            // 1
        print("x is in range from 1 to 5")
    }
    println()
    println("-------------------------------------")

    if (x !in 6..10) {          // 2
        print("x is not in range from 6 to 10")
    }
}