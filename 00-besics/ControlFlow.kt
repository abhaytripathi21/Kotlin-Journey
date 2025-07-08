package `00-besics`

class ControlFlow {
    fun controlFlow(){

        // 1. if, else, else if

        val score = 85

        if (score >= 90) {
            println("Grade: A")
        } else if (score >= 75) {
            println("Grade: B")
        } else {
            println("Grade: C or below")
        }

       // 2. when expression

        val day = 3
        val dayName = when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day"
        }
        println("Day $day is $dayName")

        // 3. for loop

        println("For loop (1 to 5):")
        for (i in 1..5) {
            print("$i ")
        }
        println()

        // 4. while loop

        var count = 1
        println("While loop (1 to 3):")
        while (count <= 3) {
            println("Count = $count")
            count++
        }

        // 5. do...while loop

        var num = 1
        println("Do-while loop (1 to 3):")
        do {
            println("Num = $num")
            num++
        } while (num <= 3)

        // 6. Loop ranges and steps

        println("Loop with steps:")
        for (i in 0..10 step 2) {
            print("$i ")
        }
        println()

        println("Loop in reverse:")
        for (i in 5 downTo 1) {
            print("$i ")
        }
        println()


        // 7. break and continue

        println("Using break:")
        for (i in 1..10) {
            if (i == 5) break
            print("$i ")
        }
        println()

        println("Using continue:")
        for (i in 1..5) {
            if (i == 3) continue
            print("$i ")
        }
    }
}
