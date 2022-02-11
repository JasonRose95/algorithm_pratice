

fun firstNonRepeatingCharacter(string: String): Int {
    // Write your code here.
    var characters = mutableMapOf<Char, Int>()  

    for(i in string){
       characters[i] = characters.getOrDefault(i, 0) + 1
    }
    for(j in 0 until string.length){
       val character = string[j]
       if(characters[character] == 1) return j
    }
    
    return -1
}