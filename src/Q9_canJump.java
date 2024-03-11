
public class Q9_canJump {

	public static void main(String[] args) {
		int[] nums = {2,3,1,0,4};
		System.out.println(canJump(nums));

	}
	public static boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if( i + nums[i] >= lastIndex) {
                lastIndex = i;
            }
        }
        return lastIndex == 0;
    }

}
