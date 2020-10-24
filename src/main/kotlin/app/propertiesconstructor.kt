package app

import data.User

fun main() {
    val user1 = User("Zain", "123")
    val user2 = User("Nur", "321")

    user1.usernameParam = "Pradana"
    user1.passwordParam = "456"

    println(user1.usernameParam)
    println(user1.passwordParam)

    println(user2.usernameParam)
    println(user2.passwordParam)
}