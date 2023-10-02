fun main(){
    val array  = arrayOf(1, 2, 3) //the value of array can be changed during runtime
    array[0] = 3
    val list = listOf(1, 2, 3)
    /* the values of the list can't be changed during runtime
       the list is immutable originally, but we can change it
       a val list = mutableListOf(1, 2, 3) */

    /*Question: What is the difference between a mutable list and an array now?
    * Answer: The major difference from the usage side is that Arrays have a fixed size while (Mutable)List can adjust
      their size dynamically */

    val list2 = mutableListOf(1, 2, 3)
    list2.add(4)
    println(list2)
    list2.remove(2)
    println(list2)
    list2.removeAt(1) //remove values at provided index value as index[1] has value 3
    println(list2)

    /*Take input from user in the list: */
    val list1 = mutableListOf<Int>() //<> takes the type as input
    println("Enter the 10 input values: ")
    for (i in 1..10){
        val x = readLine()?.toInt()
        if(x != null){
            list1.add(x)
        }
    }
    println("The entered list is: $list1")

    println("<============================Homework============================>")


    /* Question: Take an input of list 5 numbers and reverse them */
    val list3 = mutableListOf<Int>()
    println("Enter any 5 numbers: ")
    for(i in 1..5){
        val x = readLine()?.toInt()
        if(x != null){
            list3.add(x)
        }
    }
    println("List formed is: $list3")
    print("Reversed List is: ")
    println(list3.reversed())
    for(i in list3.reversed()){
        println(i)
    }

    /* Question: Take number as input and print Fibonacci number till that*/
    print("Enter a number greater than 1: ")
    val z = readLine()?.toInt()
    var y = 0
    val list4 = mutableListOf<Int>()
    if(z != null){
        for(i in 1..z){
            y += i
            list4.add(i)
        }
    }
    println(y)
    println(list4)
}
