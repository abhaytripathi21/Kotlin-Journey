package `01-functions`

class Recursion {
    // 1. Recursive Function: Factorial

    fun factorial(n: Int): Int {
        // Base case
        if (n == 0) return 1
        // Recursive case
        return n * factorial(n - 1)
    }

    // 2. Recursive Function: Fibonacci

    fun fibonacci(n: Int): Int {
        return if (n <= 1) n
        else fibonacci(n - 1) + fibonacci(n - 2)
    }

    // 3. Tail Recursion: Factorial

    // Optimized for large inputs
    tailrec fun tailFactorial(n: Int, accumulator: Int = 1): Int {
        return if (n == 0) accumulator
        else tailFactorial(n - 1, accumulator * n)
    }

    // Main function to test above
    /*
    fun main() {
    println("Factorial of 5: ${factorial(5)}")            // Regular recursion
    println("Fibonacci of 6: ${fibonacci(6)}")             // Regular recursion
    println("Tail-recursive factorial of 5: ${tailFactorial(5)}")  // Tail recursion

    // Uncomment to test performance difference on larger inputs
    // println("Tail-recursive factorial of 1000: ${tailFactorial(1000)}")
    }
     */


}