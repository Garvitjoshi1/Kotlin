fun main() {
    val x = 7
    val y = 7
    if(x < y){
        println("x is lesser than y")
    }
    else if(x > y){
        println("x is greater than y")
    }
    else{
        println("x is equal to y")
    }
    println("This line will always be executed")
//<---------------------------------------------------------------------------------------->
    if(x < y || y * y == 49)
        println("at least one of the condition is true")
    else if(x > y)
        // need not use curly braces if working as per syntax
        println("x is greater than y")
    else
        println("x is equal to y")
    println("This line will always be executed")

    val z = if(x+y == 14) 3 else 4
    println("Value of Z is: $z")

    println("=======================HOMEWORK=======================")
    print("Enter the string you want to check palindrome: ")
    val str = readln()
    if (str == str.reversed())
    {
        println("$str is a palindrome.")
    }
    else {
        println("$str is not a palindrome.")
    }
}
