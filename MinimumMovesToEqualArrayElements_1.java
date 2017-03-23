package com.xjtuse.easy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements_1 {

	public static int minMoves(int []nums){
		
		int min=nums[0];
		for(int i=0;i!=nums.length;i++){
			if(nums[i]<min){
				min=nums[i];
			}
		}
		int step=0;
		for(int i=0;i<nums.length;i++){
			step+=(nums[i]-min);
		}
		System.out.println("step:"+step);
//		for(int K:nums){//test para
//			System.out.print(K+" ");
//		}
		return step;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={2,1,3};
		int []nums={5,8,1};
		minMoves(nums);
	}

}
