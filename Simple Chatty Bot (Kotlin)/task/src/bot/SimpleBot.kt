package bot

import java.util.Scanner
import kotlin.collections.List


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val rems = List(3) { scanner.nextInt() }
    val age = (rems[0] * 70 + rems[1] * 21 + rems[2] * 15) % 105

    println("Your age is $age; that's a good time to start programming!")
}
