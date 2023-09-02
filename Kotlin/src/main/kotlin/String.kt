import java.util.*

fun main() {
    var s = "This is an example text"
    println(s)

    println("Our string is: $s")
    //or println("Our string is: $s.toUppercase().toLowerCase()")

    println("Our string is: ${s.uppercase()}") //.toUppercase preform the same

    println("Our string is: ${s.lowercase()}") //.toLowercase preform the same

    println("==================HomeWork====================")
    print("Your name is : ")
    var name = readLine()
    println("Name in Correct form : $name")
    if (name != null) {
        println("Name in reversed form : ${name.reversed()}")
    }
}
