class Solution {
    fun majorityElement(nums:IntArray):Int{
	    val size = nums.size
	    val map = HashMap<Int,Int>()
	    for(num in nums){
		    map[num] = map.getOrDefault(num,0) + 1
        }

        for((key,value) in map){
	        if(value > size/2) return key
        }

        return -1
    }

}
