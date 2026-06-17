class Solution {
   fun maxSubArray(nums:IntArray):Int{
        var maxSum = nums[0]
        var currSum = 0
        val len = nums.size
        
        var i = 0
        while(i < len){
            if(currSum < 0) currSum = 0
            currSum += nums[i++]
            maxSum = maxOf(currSum, maxSum)
        }
        

        return maxSum
    } 

}
