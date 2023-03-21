package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    introduce()
    greet(scanner)
    guessAge(scanner)
    countNumbers(scanner)
}

private fun countNumbers(scanner: Scanner) {
    println("Now I will prove to you that I can count to any number you want.")
    (0..scanner.nextInt()).forEach{ println("$it!") }
    println("Completed, have a nice day!")
}

private fun guessAge(scanner: Scanner) {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

    println("Your age is " + age + "; that's a good time to start programming!")
}

private fun greet(scanner: Scanner) {
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
}

private fun introduce() {
    println("Hello! My name is Aid.")
    println("I was created in 2020.")
}

