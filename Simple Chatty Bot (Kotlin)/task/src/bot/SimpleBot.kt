package bot

import java.time.LocalDateTime

fun main() {
    greetings("Chatty", LocalDateTime.now().year)
}

fun greetings(botName: String, birthYear: Int) {
    println("""Hello! My name is $botName.
I was created in $birthYear.""")
}
