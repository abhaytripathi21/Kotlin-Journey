package `01-functions`

class Lambdas {
    fun lambdas(){
        // 1. Lambda Expressions

        val sum: (Int, Int) -> Int = { a, b -> a + b }
        val greet: (String) -> String = { name -> "Hello, $name!" }

        println("Sum of 4 and 5: ${sum(4, 5)}")
        println(greet("Abhay"))

        // 2. it Keyword (used when there's one parameter)

        val isEven: (Int) -> Boolean = { it % 2 == 0 }
        println("Is 6 even? ${isEven(6)}")

        // 3. Passing Lambdas to Functions

        fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
            return op(a, b)
        }

        val result = operate(10, 3) { x, y -> x * y }
        println("Multiplication using lambda: $result")

        // 4. Inline Operations: filter, map, forEach

        val numbers = listOf(1, 2, 3, 4, 5, 6)

        println("Even numbers:")
        numbers.filter { it % 2 == 0 }.forEach { println(it) }

        println("Squares:")
        val squares = numbers.map { it * it }
        squares.forEach { println(it) }

        println("Original numbers:")
        numbers.forEach { print("$it ") }
    }
}