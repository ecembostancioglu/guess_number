package com.example.guessnumber
import kotlin.random.Random


fun main() {
    val randomNumber = Random.nextInt(0, 101)
    var guess = 3

    println("*** WELCOME TO THE GUESSNUMBER GAME! ***")

    while (guess > 0) {
        println("Your remaining guess: $guess")
        println("Please enter a number between 0 and 101: ")
        val input = readLine()?.toIntOrNull()

        if (input != null) {
            when {
                input == randomNumber -> {
                    println("Congratulations! You guessed the correct number. You are the best!")
                    return
                }
                input < randomNumber -> {
                    println("You should enter a bigger number!")
                }
                else -> {
                    println("You should enter a smaller number!")
                }
            }
        }

        guess--

    }

    println("The game is over. You lost! The number is $randomNumber")
}



