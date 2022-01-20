
class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun add(element: E) = elements.add(element)

    fun last(): E = elements.last()

    fun remove(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}