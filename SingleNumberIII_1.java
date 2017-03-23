package com.xjtuse.easy;

import java.util.Arrays;

public class SingleNumberIII_1 {

	public static int[] singleNumber(int []nums){
		int []result=new int[2];
		Arrays.sort(nums);
		int length=nums.length;
		int k=0;
		for(int i=0;i<length-1;){
			if(nums[i]==nums[i+1]){
				i+=2;
			}else{
				result[k++]=nums[i];
				i++;
			}
		}
		if(k==1){
			result[k]=nums[length-1];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,1,3,2,5};
		int []nums={0,0,1,2};
		int []r=singleNumber(nums);
		for(int k:r){
			System.out.print(k+" ");
		}System.out.println();
	}

}
