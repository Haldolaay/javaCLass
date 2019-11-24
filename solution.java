class Solution {
	// this function will look into an array of numbers and 
	// find the sum of two numbers adding up to the target argument
    public static  int[] twoSum(int[] nums, int target) {
   for (int i = 0 ; i < nums.length ; i++){
       for (int j = 0 ; j < nums.length ; j++){
           if (nums[i]+ nums[j] == target ){
               int[] result = {i, j};
               return result;
           }
       }
   }
        return nums;
}
}
class driver{
	public static void main(String[]args){
		int[] nums = {1,2,3};
		int[] result = Solution.twoSum(nums,4);
		System.out.println(result);
	}
}