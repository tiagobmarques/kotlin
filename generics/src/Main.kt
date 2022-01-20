fun main() {
    var mutableList = MutableStack(items = arrayOf("a", "b", "c"))
    println("MutableList Is Empty?: ${mutableList.isEmpty()}")
    println("MutableList Size: ${mutableList.size()}")
    println("MutableList: $mutableList")
    println("MutableList Last: ${mutableList.last()}")
    mutableList.add("d")
    println("MutableList Added d: $mutableList")
    println("MutableList Last: ${mutableList.last()}")
    mutableList.remove()
    println("MutableList Removed last: $mutableList")
    println("MutableList Last: ${mutableList.last()}")
    mutableList.remove()
    mutableList.remove()
    mutableList.remove()
    println("MutableList Is Empty?: ${mutableList.isEmpty()}")
    println("MutableList Size: ${mutableList.size()}")

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
