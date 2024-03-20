
public class Q10_JumpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,1,1,4};
		
		System.out.println(jump(nums));

	}
	
	public static int jump(int[] nums) {
        if ( nums.length == 1) {
            return 0;
        }

        int currentReach = 0;
        int i = 0;
        int jumps = 0;
        int previousReach =0;

        for ( int x : nums) {
            currentReach = Math.max(currentReach, i + x);
            if ( currentReach >= nums.length -1) {
                return jumps + 1;
            }
            if ( i== previousReach) {
                jumps++;
                previousReach = currentReach;
            }
            i++;
        }

        return jumps;

    }

}
