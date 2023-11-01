package exercise;

import java.util.Arrays;

public class RemoveDuplicates {
    /**
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     *  int [] test ={0,0,1,1,1,2,2,3,3,4};

     */
    public static void main(String[] args) {
        int[] test = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(removeDuplicate(test)));
    }
    public static int[] removeDuplicate(int[] nums) {
        int[] newArray = new int[]{};
        int newPos = 0;
        newArray[newPos] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != newArray[i - 1]) {
                newPos += 1;
                newArray[newPos] = nums[i];
            }

        }
        return newArray;
    }

}
