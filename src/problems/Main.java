package problems;

import problems.TwoSum.TwoSumImplementation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSumImplementation.twoSum(nums, target)));
    }
}
