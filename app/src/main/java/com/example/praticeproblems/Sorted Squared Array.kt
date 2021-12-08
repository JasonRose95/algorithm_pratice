package com.example.praticeproblems

fun main(){
    val oneThruNine = listOf<Int>(1,2,3,4,5,6,7,8,9)
    print(sortedSquaredArray(oneThruNine))
}
fun sortedSquaredArray(array: List<Int>): List<Int> {
    val arraySquared = mutableListOf<Int>()
    for(i in array){
        var squared = i * i
        arraySquared.add(squared)
    }
    arraySquared.sort()
    return arraySquared
}
