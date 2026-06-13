class Solution {
    fun sortArray(nums: IntArray): IntArray {
        sortArrayUtil(nums, 0, nums.size - 1)
        return nums

    }

    private fun sortArrayUtil(nums:IntArray, low:Int, high:Int){
        if(low < high){
            val partitionIndex = partition(low, high,nums)
            sortArrayUtil(nums, low, partitionIndex - 1)
            sortArrayUtil(nums, partitionIndex +1, high)
        }
    }

    private fun partition(low:Int, high:Int, nums:IntArray):Int{
        val pivot = nums[low]
        var left = low
        var right = high

        while(left < right){
            //Search for an element greater than the pivot, till that time, increment
            while(left <= high && nums[left] <= pivot) left++
            //Search for an element less than the pivot, till that time, increment
            while(right >= low && nums[right] > pivot) right--

            if(left < right){
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
            }

        }

        val temp = nums[low]
        nums[low] = nums[right]
        nums[right] = temp

        return right
    }


}
