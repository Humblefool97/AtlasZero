class Solution {
  fun lemonadeChange(bills: IntArray): Boolean {
    var fiveCount = 0
    var tenCount = 0

    for (bill in bills) {
        when (bill) {
            5 -> {
                fiveCount++
            }
            10 -> {
                if (fiveCount == 0) return false
                fiveCount--
                tenCount++
            }
            20 -> {
                // Greedy choice: Always try to give a $10 and a $5 first
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--
                    fiveCount--
                } else if (fiveCount >= 3) {
                    fiveCount -= 3
                } else {
                    // We don't have the physical bills to make $15 change
                    return false
                }
            }
        }
    }
    return true
}
}

