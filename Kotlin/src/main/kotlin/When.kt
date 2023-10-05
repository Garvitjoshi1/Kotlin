fun main() {
    val age = readLine()?.toInt()
    val x = 6

    // when is always dependent on only one variable.
    when (age) {
        in 0..5 -> println("You are a young kid")

        /* To print more than one line, we use curly brackets
        * in 0..5 -> {
               println("You are a young kid")
               println("Another Line")
        }
          */

        in 6..17 -> println("You are a Teenager")
        18 -> println("Finally, You are 18")

        /* way to check more variable in when condition
        18 -> if(x == 6){
            println("You are finally 18")
        }     */

        19, 20 -> println("You are a Young Adult")
        in 21..65 -> println("You are an Adult")
        else -> println("You are really old")
    }

    /* To save time from this lengthy syntax, we use the above when statement as a switch case.
    if (age in 0..5){
        println("You are a young kid")
    }
    else if(age in 6..17){
        println("You are a Teenager")
    }
    else if(age == 18){
        println("Finally, You are 18")
    }
    else if(age == 19 || age == 20){
        println("You are a Young Adult")
    }
    else if(age in 21..65){
        println("You are an Adult")
    }
    else{
        println("You are really old")
    }
    */

    println("<======================HOMEWORK======================>")

    val country = readLine()
    when (country){
        "India" -> println("Namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Halo")
        "Russia" -> println("privet")
        else -> println("I don't know")
    }
}
