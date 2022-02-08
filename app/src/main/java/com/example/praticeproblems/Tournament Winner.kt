package com.example.praticeproblems

import java.util.*

fun main(){
    var competitors = listOf<List<String>>(
        listOf("HTML", "C#"),
        listOf("C#", "Python"),
        listOf("Python", "HTML"),
    )
    var result = listOf<Int>(0, 0, 1)
    print(tournamentWinner(competitors,result))
}

    private fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    val finals = competitions[results.size-1]
    if(results[results.size-1] == 1){
        return finals[0]
    }
    if (results[results.size-1] == 0){
        return finals[1]
    }
    return ""
}
