class Solution {
	// this function will look into an array of numbers and 
	// find the sum of two numbers adding up to the target argument
	// I wanted to try out calling a static function without instantiating a class object
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
	// this function will reverse a 2d array
	public static void flipItVerticalAxis(int[][] matrix) {
     int count = 0 ;
    int temp = 0 ;
    for(int i = 0 ; i < matrix.length; i++){
        count = matrix[i].length-1;
        for(int j = 0 ; j< matrix[i].length/2 ; j++){
      
            temp = matrix[i][j];
            matrix[i][j] = matrix[i][count];
            matrix[i][count] = temp;
          
        }
        
}
}
class driver{
	public static void main(String[]args){
		int[] nums = {1,2,3};
		int[] result = Solution.twoSum(nums,4);
		System.out.println(result);
	}
}
// reverse a number 
public int reverse(int x) {
long temp = 0;
        while(x!=0) {
            temp = temp*10 + x%10;
            x /= 10;
        }
        if(temp >=Integer.MAX_VALUE || temp <= Integer.MIN_VALUE)
            return 0;
        return (int)temp;
    }
