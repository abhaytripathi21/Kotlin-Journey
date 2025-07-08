package `01-functions`

class Functions {

    // 1. Function Declaration and Calling

    fun greetUser() {
        println("Hello, welcome to Kotlin functions!")
    }

    // 2. Parameters and Return Types

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // 3. Default and Named Arguments

    fun greet(name: String = "Guest", language: String = "English") {
        println("Hello, $name! Preferred language: $language")
    }


    // 4. Unit Return Type

    // A function that doesn't return anything (similar to void)
    fun printMessage(msg: String): Unit {
        println("Message: $msg")
    }


    // 5. Single-expression Functions

    fun square(n: Int) = n * n  // Return type inferred automatically

    // Main function to test above
    /*
    fun main() {
        greetUser()

        val result = add(10, 5)
        println("Sum: $result")

        greet("Abhay", "Hindi")              // Named arguments
        greet(language = "Spanish", name = "Ravi") // Named in different order
        greet()                              // Uses default values

        printMessage("This is Kotlin.")

        println("Square of 7: ${square(7)}")
    }
    */

}