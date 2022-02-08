fun nonConstructibleChange(coins: MutableList<Int>): Int {
    // Write your code here.
    coins.sort()

    var currentChangeCreated = 0
    for (coin in coins){
        if(coin > currentChangeCreated + 1) return currentChangeCreated + 1

        currentChangeCreated += coin
    }
    return currentChangeCreated + 1
}
