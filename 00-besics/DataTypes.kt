package `00-besics`

class DataTypes{
    fun dataTypes(){
        // 1. Basic Data Types

        val age: Int = 22
        val population: Long = 1_400_000_000
        val height: Float = 5.9f
        val weight: Double = 70.5
        val grade: Char = 'A'
        val isStudent: Boolean = true
        val name: String = "Abhay"

        println("Name: $name, Age: $age, Grade: $grade")
        println("Height: $height ft, Weight: $weight kg")
        println("Student status: $isStudent")

        // 2. Type Conversion

        val intVal = 10
        val doubleVal = intVal.toDouble()  // Int to Double
        val stringVal = intVal.toString()  // Int to String

        println("Converted to Double: $doubleVal")
        println("Converted to String: $stringVal")

        // 3. Nullable Types and Safe Calls

        var email: String? = "abhay@example.com"

        println("Email length (safe call): ${email?.length}")  // Safe call
        println("Email length (with default): ${email?.length ?: "No email"}")  // Elvis operator

        email = null
        println("Null email length (safe call): ${email?.length}") // Will print: null

        // Force unwrap (will crash if null)

    }

}
