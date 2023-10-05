fun main(){
    print("Please Enter a number: ")
    val input = readLine()?.toInt()

    if(input != null){
        if(input.isPrime()){
            println("$input is a prime number")
        }
        else{
            println("$input is not a prime number")
        }
    }

    println("<===============HOMEWORK============>")

    val list1 = mutableListOf<Int>()
    print("Enter the number of elements: ")
    val n = readLine()?.toInt()
    if(n != null){
        for(i in 1..n){
            var x = readLine()?.toInt()
            if(x != null){
                list1.add(x)
            }
        }
    }
    println("Given list is: $list1")
    print("The product of element is: ${product(list1)}")
}

fun Int.isPrime(): Boolean{
    for(i in 2 until this -1){
        if(this % i == 0){
            return false
        }
    }
    return true
}

fun product(list: MutableList<Int>): Int{
    var p = 1
    for (i in list.indices){
        p *= list[i]
    }
    return p
}
