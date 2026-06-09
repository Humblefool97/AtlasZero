class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(2 * size){0}
        var i = 0
        var j = size
        while(i < size){
            ans[i] = nums[i]
            ans[j++] = nums[i]
            i++
        }

        return ans
    }
}
