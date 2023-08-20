fun main(){
    var myVariable =  5
    // we can use val instead of var if we don't want the value to be changed.
    //var myVariable: Int = 5, the above form and below provide same output

    println(myVariable)
    // print("myVariable") prints the text inside quotes.

    println("The value of the variable is: $myVariable")
    // $ with variable name is used to fetch the value declared.

    myVariable = 1 // To update the value
    println("The Updated value is: $myVariable")

    println("<===============================================================>")

    var bool: Boolean = true
    println("The value of the variable is: $bool")

    bool = false
    println("The Updated value is: $bool")

    println("<===============================================================>")
    var age = 19
    var number = 1
    println("My favourite number is $number and my age is $age")

}
