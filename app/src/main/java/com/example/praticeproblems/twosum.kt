package com.example.praticeproblems

import java.util.*

fun main() {
    val array1 = arrayOf(3,5,-4,8,11,1,-1,6)
    val targetSum1 = 10
//printnew(array1)
print(Arrays.toString(twoNumberSum(array1,targetSum1)))
}

fun twoNumberSum(array:Array<Int>, targetSum:Int): Array<Int> {
    var Index1: Int = 0
    var Index2: Int = 0
    var answer: Array<Int> = arrayOf()
    for (i in array) {
        for (j in array) {
            if ((targetSum - i) == j && i != j) {
                answer = arrayOf(Index1, Index2)
                Index2++
                break
            } else if (Index2 > 7) {
                Index2 = 0
                Index2++
            } else
                Index2++
        }
        if (!answer.contentEquals(arrayOf())) {
            break
        }
        Index1++

        }
    return answer
    }



//fun printnew(array:Array<Int>) {
//    for (i in array) {
//        for (j in array) {
//            println("$j")
//        }
//    }
//}