package com.mykyta.solution;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public int[] sumOfTwo (int[] nums, int sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(sum - nums[i])){
                result[0] = i;
                result[1] = map.get(sum - nums[i]);
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
