package com.example.praticeproblems
fun main(){
    val arr = listOf<Int>(5, 1, 22, 25, 6, -1, 8, 10)
    val seq = listOf<Int>(1,6,-1,10)
    print(isValidSubsequence(arr, seq))
}
fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    for (i in sequence) {
        if (array.contains(i)) {
            continue
        } else {
            return false
        }

    }
    return true
}