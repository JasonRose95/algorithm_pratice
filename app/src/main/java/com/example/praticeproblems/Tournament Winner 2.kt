package com.example.praticeproblems

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
    var currentBestTeam =""
    val scores = mutableMapOf(currentBestTeam to 0)
    return ""
}
