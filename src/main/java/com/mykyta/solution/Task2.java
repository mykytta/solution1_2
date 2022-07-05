package com.mykyta.solution;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public boolean findDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.add(num) == false){
                return true;
            }
        }

        return false;
    }
}
