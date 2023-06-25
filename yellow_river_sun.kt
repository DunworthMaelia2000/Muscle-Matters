import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Welcome message
    println("Welcome to a fitness coaching program!")

    // Get user's name
    print("What is your name? ")
    val name = scanner.nextLine()
    println("Nice to meet you, $name! Let's get you started on your fitness journey.\n")

    // Get user's current fitness level
    print("On a scale of 1-5, how fit are you? ")
    val currentLevel = scanner.nextLine().toInt()
    println("\nOk, so your current fitness level is $currentLevel.\n")

    // Determine user's fitness goal
    print("What is your fitness goal? ")
    val goal = scanner.nextLine()
    println("\nGreat! Let's work towards you achieving your goal of $goal.\n")

    // Get user's current diet
    print("What is your current diet? ")
    val currentDiet = scanner.nextLine()
    println("\nOk, your current diet is $currentDiet.\n")

    // Determine user's optimal diet
    print("What would you like your optimal diet to be? ")
    val optimalDiet = scanner.nextLine()
    println("\nAwesome! Your optimal diet will be $optimalDiet.\n")

    // Get user's current exercise regimen
    print("What is your current exercise regimen? ")
    val currentExercise = scanner.nextLine()
    println("\nOk, your current exercise regimen is $currentExercise.\n")

    // Determine user's optimal exercise regimen
    print("What would you like your optimal exercise regimen to be? ")
    val optimalExercise = scanner.nextLine()
    println("\nGot it! Your optimal exercise regimen will be $optimalExercise.\n")

    // Output current fitness level
    println("Ok $name, let's review the current state of your fitness journey:")
    println("Current fitness level: $currentLevel")
    println("Current diet: $currentDiet")
    println("Current exercise regimen: $currentExercise\n")

    // Output desired fitness level
    println("Let's also review the desired state of your fitness journey:")
    println("Goal: $goal")
    println("Optimal diet: $optimalDiet")
    println("Optimal exercise regimen: $optimalExercise\n")

    // Output action steps
    println("Let's get started by taking the following action steps:")
    println("1. Increase your nutritional knowledge by reading books or blogs about nutrition.")
    println("2. Start by making small changes to your current diet, such as increasing your intake of fruits and vegetables.")
    println("3. Make exercise a part of your daily routine by setting aside time each day to work out.")
    println("4. Monitor your progress and make adjustments as needed.\n")

    // Output encouragement
    println("Remember $name, consistency is key. Keep working hard and you'll reach your goal soon!")
}