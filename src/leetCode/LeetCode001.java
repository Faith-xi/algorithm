package leetCode;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：LeetCode001
 * Create date： 2020/4/19 13:24
 * Description：TODO
 * Update history：
 * ================================================
 */

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

import util.PrintUtil;

import java.util.HashMap;
public class LeetCode001 {

    public static int[] two_sum(int[] nums, int target){
        int[] index = new int[]{0,1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])){
                index[1] = i;
                index[0] = hm.get(target-nums[i]);

            }else{
                hm.put(nums[i],i);
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,8,11,15};
        int[] index = two_sum(nums,13);
        PrintUtil.printArray(index);
    }



}
