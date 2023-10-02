fun main() {

    val userInput = readLine()
    println("You entered $userInput")

    //  print(userInput.toUpperCase()) gives error, if the userInput is Null
    println(userInput?.toUpperCase()) // this question-mark checks the Null and then proceed

    if(userInput != null){
        println(userInput.toInt() - 5)
        // toInt only convert string (15) input to int(15) input. not the text string
        //println(userInput?.toInt() - 5) this line without if condition gives error because it checks for string
    }

    println("<========================HOMEWORK========================>")

    print("Please enter your age: ")
    val age = readLine()?.toInt()
    if (age != null){
        if (age.toInt() <= 18){
            print("You are not an Adult")
        }
        else if (age.toInt() in 19..65){
            print("You are an Adult")
        }
        else{
            println("You are really really old")
        }
    }
}
