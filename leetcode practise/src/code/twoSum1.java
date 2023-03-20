package code;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
* */

import java.util.HashMap;

class twoSum1{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        print(twoSum(nums, target));
        System.out.println("-----------------------");
        print(twoSumMethod2(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i]; //get the number of we need
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == temp){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumMethod2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int result = target-nums[i];

            //direct search in map , but index couldn't same as first one
            if(map.containsKey(result) && map.get(target-nums[i]) != i){
                return new int[] {i, map.get(result)} ;
            }
        }
        return null;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print("->");
            }

        }
        System.out.println();
    }
}