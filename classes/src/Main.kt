class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()
    println("Customer $customer")

    val contact = Contact(1, "tiagobm@gmail.com")

    println("Contact Id: ${contact.id}")
    // Val cannot be reassigned
    // contact.id = 2
    println("Contact Email Old: ${contact.email}")
    contact.email = "tiagobm564@gmail.com"
    println("Contact Email New: ${contact.email}")
}