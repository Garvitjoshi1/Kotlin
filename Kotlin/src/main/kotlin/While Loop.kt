fun main() {
    val myArray = arrayOf(3, 2, 6, 4)
    // way to create an array
    val myArray1 = arrayOf("Hello", "Hi", "You")
    val myArray2 = arrayOf("hello", "guys", "whats up?")

    val first = "hello"
    val second = "guys"
    val third = "whats up?"

    println(myArray2) // [Ljava.lang.String;@2f4d3709 is the answer we get, here @2f4d3709 is the address where string is stored

    println(myArray2[1]) // to print values in index of array index starting with 0

    var x = 3
    while ( x > 1 ){
        println("Hello")
        x-- //decrease x by 1 everytime it checks
    }
    println("whats up?")

    val arrayLength = myArray2.size //.size to know the length of array
    var i = 0
    while (i < arrayLength){
        println(myArray2[i])
        i++
    }

    println("<======================HOMEWORK<======================")

    /* Question1: Take a number as input and print its value to 0 in reverse order*/
    print("Please enter a number: ")
    var num = readLine()?.toInt()
    println("Let's count number from $num to 0:")
    if (num != null) {
        while (num >= 0){
            println(num)
            num--
        }
    }

    /* Question2: Take input of two number and print x power y */
    print("Enter num1: ")
    val num1 = readLine()?.toInt()
    print("Enter num2: ")
    val num2 = readLine()?.toInt()

    var result = 1
    var item = 0
    while (num1 != null && num2 != null && item < num2){
        result *= num1
        item++
    }
    println("$num1 to the power $num2 is: $result")
}
