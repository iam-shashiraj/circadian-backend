package com.iamshashiraj.apis.solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSumToTarget {
    public static void main(String[] args) {
        int[] inputArray = new int[] {2, 3, 4, 6, 8};
        int target = 11;

        int[] result = findTwoSumToTarget(inputArray, target);
        System.out.println("Indices are: " + result[0] + " " + result[1]);
    }

    static int[] findTwoSumToTarget(int[] numbers, int target) {
        Map<Integer, Integer> traversedNumbersMap = new HashMap<Integer, Integer>();

        for(int i=0; i< numbers.length; i++) {
            int delta = target - numbers[i];
            if (traversedNumbersMap.containsKey(delta)) {
                return new int[] {traversedNumbersMap.get(delta), i };
            } else {
                traversedNumbersMap.put(numbers[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
