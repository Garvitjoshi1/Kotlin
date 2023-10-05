fun main() {
    // VARARG
    val array = intArrayOf(10, 20, 25) //use intArrayOf to get vararg input.
    val max = getMax(1, 2, 3, 4, *array) // use *array_name to insert an array to vararg.
    println("The maximum is: $max")

    // DEFAULT PARAMETERS
    searchFor("How to become a good Programmer") //here it's not necessary to input searchEngine parameter.
    searchFor("How to be best kotlin programmer", "BingAi") //but we can change also.

    // NAMED PARAMETER
    searchFor(searchEngine = "Bing", search = "Hi, How are you?") // use parameter at your convenience.

    //HOMEWORK
    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The value of alternating sum is: $sum ")
}
// DEFAULT PARAMETERS
fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for $search on $searchEngine")
}

// VARARG
fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}

fun alternatingSum(vararg numbers: Int): Int{
    var sum = 0
    for (i in numbers.indices) {
        if (i % 2 == 0) {
            sum += numbers[i]
        }
        else {
            sum -= numbers[i]
        }
    }
    return sum
}
