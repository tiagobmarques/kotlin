fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    //Set ignore order
    println(authors == writers)   // 1
    println(authors === writers)  // 2

    val authorsList = listOf("Shakespeare", "Hemingway", "Twain")
    val writersList = listOf("Twain", "Shakespeare", "Hemingway")

    //List not ignore order
    println(authorsList == writersList)   // 1
    println(authorsList === writersList)  // 2
}