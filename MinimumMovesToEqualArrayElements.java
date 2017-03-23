package com.xjtuse.easy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
	//算法思想了来自leetcode社区
	//http://www.cnblogs.com/grandyang/p/6053827.html
	public static int minMoves(int []nums){
		
		Arrays.sort(nums);
		int min=nums[0];
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
