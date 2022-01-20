
fun main() {
    var neverNull: String = "This can't be null"

    println(neverNull)
    // Null can not be a value of a non-null type String
    // neverNull = null

    var nullable: String? = "You can keep a null here"

    println(nullable)
    nullable = null
    println(nullable)

    var inferredNonNull = "The compiler assumes non-null"
    // Null can not be a value of a non-null type String
    // inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    // Type mismatch: inferred type is Nothing? but String was expected
//    strLength(nullable)
}