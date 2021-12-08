package com.example.praticeproblems
fun main(){
    val arr = listOf<Int>(5, 1, 22, 25, 6, -1, 8, 10)
    val seq = listOf<Int>(1,6,-1,10)
    print(isValidSubsequence(arr, seq))
}
fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var index = 0
    for (i in array) {
        if(index == sequence.size){
            break
        }
        if(sequence[index]== i){
            index++
        }
    }
    return index == sequence.size
}

