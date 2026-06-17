class Solution {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var currMax = nums[0]
        var currMin = nums[0]

        var globalMax = nums[0]
        var globalMin = nums[0]

        var total = nums[0]

        for(i in 1 until nums.size){
            currMax = maxOf(nums[i], currMax + nums[i])
            globalMax = maxOf(currMax, globalMax)

            total += nums[i]

            currMin = minOf(nums[i], currMin + nums[i])
            globalMin = minOf(currMin, globalMin)

        }
        //If the entire array is negative, then globalMax -ve.
        return if(globalMax < 0) globalMax else maxOf(globalMax, total - globalMin)
    }
}
