package com.xjtuse.easy;

public class FindMinimumInRotateArray {
	//there doesn't exist any duplicates in given array 
	public static int findMin(int[] nums){
		int min=nums[0];
		for(int i=0;i<nums.length;i++){
			if(min>nums[i]){
				min=nums[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={4,5,6,7,0,1,2};
		int r=findMin(nums);
		System.out.println(r);
	}

}
