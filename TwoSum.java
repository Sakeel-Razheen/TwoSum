package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		
		int[] nums=new int[5];
		
		for (int i=0;i<nums.length;i++) {
			System.out.println("Enter the Elements : ");
			nums[i] =sc.nextInt();
		}
		
		System.out.println("Enter Target : ");
        int target=sc.nextInt();	
        
        int[] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			if(map.containsKey(complement)){
				return new int[] {map.get(complement),i };
					
				}
			map.put(nums[i], i);
			}
			throw new IllegalArgumentException("No two sum solution");
		
	}
	 
}

