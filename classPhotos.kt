fun classPhotos(redShirtHeights: MutableList<Int>, blueShirtHeights: MutableList<Int>): Boolean {
    // Write your code here.
    redShirtHeights.sortDescending()
    blueShirtHeights.sortDescending()
    val shirtColorFirstRow = if(redShirtHeights[0] < blueShirtHeights[0]) "RED" else "BLUE"
    for (idx in 0 until redShirtHeights.size){
        val redShirtHeight = redShirtHeights[idx]
        val blueShirtHeight = blueShirtHeights[idx]

        if (shirtColorFirstRow == "RED"){
            if (redShirtHeight >= blueShirtHeight) return false
        }else{
            if(blueShirtHeight >= redShirtHeight) return false
        }
    }
    return true
}
