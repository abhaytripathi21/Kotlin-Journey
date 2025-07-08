package `00-besics`

class Variables {
    // Demonstrates basic variable usage in Kotlin

    fun variables() {
        // 1. val vs var

        val pi = 3.14159  // Immutable variable (read-only)
        var age = 25      // Mutable variable (can be reassigned)

        // Uncommenting the next line would cause an error:
        // pi = 3.14

        age = 26 // Allowed, because 'age' is declared with var
        // 2. Type Inference

        val name = "Abhay"          // Kotlin infers this as String
        val score = 95              // Inferred as Int
        val isPassed = true         // Inferred as Boolean

        // 3. Explicit Type Declaration

        val language: String = "Kotlin"
        var temperature: Double = 36.6
        val grade: Char = 'A'

        // 4. String Templates

        println("Hello, my name is $name and I'm $age years old.")
        println("I scored $score in the test. Grade: $grade")
        println("Learning $language is fun!")
        println("Pi is approximately $pi")
    }


}