package com.xjtuse.easy;

import java.util.Arrays;

public class FindDuplicate_M {
	//because all the elements are integers and positive ,so transfer 
	//array into String will be much easier to tackle(fail:just suitable for
	//nums <=9)
	
	//the replicated elements appeared at least once 
	public static int findDuplicate(int []nums){
		Arrays.sort(nums);
		int i=0;
		for(int j=1;j<nums.length;j++){
			if(nums[i]==nums[j]){
				return nums[i];
			}
			i=j;
		}
		//test para
		for(int K:nums){
			System.out.print(K+" ");
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,1,6,7};
		int []nums={1,2,3,4,5,6,5,5,7};
		int n=findDuplicate(nums);
		System.out.println(n);
	}

}
