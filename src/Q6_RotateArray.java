
public class Q6_RotateArray {

	public static void main(String[] args) {
		
		// I could not run the code properly in eclipse. But in the LeetCode, the code block in the below is working.

	}
	
	 public static void reverse(int[] nums, int start, int end) {
	        while( start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;

	            start++;
	            end--;
	        }
	 }
	 
	 public static void rotate(int[] nums, int k) {
	        int n = nums.length;
	        k = k % n;
	        reverse(nums,0,n-1);
	        reverse(nums,0,k-1);
	        reverse(nums,k,n-1);
	        
	 }
	 
	 
	 

}
