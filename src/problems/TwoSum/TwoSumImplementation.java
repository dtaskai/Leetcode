package problems.TwoSum;

public class TwoSumImplementation {
    public static int[] twoSum(int[] nums, int target) {
        int subtarget;
        for(int i=0;i<nums.length;i++){
            subtarget=target-nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]==subtarget){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
