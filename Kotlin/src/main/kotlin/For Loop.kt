fun main(){
    val myArray = arrayOf(1, 2, 3)
    for (i in myArray){
        print("$i ")
    }
    println()
    // we can write the above code without an array by using range
    for (j in 5..10){
        print("$j ")
    }
    println()
    // for reverse order
    for (k in 10 downTo 5){
        print("$k ")
    }
    println()
    // using increment
    for (l in 1..10 step 2){
        print("$l ")
    }
    println()
    for (m in 10 downTo 1 step 2){
        print("$m ")
    }
    println()
    // for in alphabet
    for (i in 'a'..'z'){
        print("$i ")
    }
    println()
    /* Question:
    * Write a program to find the maximum value stored in the array and save it to a variable*/
    val array = arrayOf(4, 5, 8, 9, 10, 2, 3)
    var max = array[0]
    for (item in array){
        if(item > max){
            max = item
        }
    }
    println("The maximum value is: $max")

    println("<==========================HOMEWORK==========================>")

    /* Question: To print a sum of array */
    val array1 = arrayOf(2, 3, 6, 1, 8)
    var add = 0
    for (i in array1){
        add += i
    }
    println("The sum of array is: $add")

    /* Question: User Enters 5 Numbers and calculates average to it */
    val n = readLine()?.toInt()
    println("Enter $n Numbers: ")
    var avg = 0.0
    if(n != null){
        for (i in 1..n){
            val input = readLine()?.toInt()
            if(input!= null){
                avg += input
            }
        }
        avg /= n
    }
    println("The average value is: $avg")
}
