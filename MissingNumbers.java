package com.xjtuse.easy;

import java.util.Arrays;

public class MissingNumbers {

	public static int missingNumber(int []nums){
		Arrays.sort(nums);
		if(nums[0]!=0){
			return 0;
		}
		int i=0;
		for(int j=1;j<nums.length;j++){//0 cannot be detected
			if(nums[j]==nums[i]+1){
				i=j;
				continue;
			}
			return i+1;
		}
		return nums.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={0};
		int r=missingNumber(nums);
		System.out.print(r+" ");
	}

}
