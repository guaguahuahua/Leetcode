package com.xjtuse.easy;

import java.util.Arrays;

public class SingleNumberII {
	public static int singleNumber(int []nums){
		Arrays.sort(nums);
		for(int K:nums){
			System.out.print(K+" ");
		}System.out.println();
		
		int template=nums[0];//initiate template
		int k=0;
		int singleNumber=0;
		int length=nums.length;
		for(int i=0;i!=length;i++){
			if(template==nums[i]){
				k++;
			}else{
				if(k==3){
					template=nums[i];//renew template
					k=1;
				}else{
					singleNumber=nums[i];
				}
			}
		}
		if(k==1){
			return template;
		}
		return singleNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={-1,2,1,2,3,-1,1,3,6,1,3,2,-1};
		int r=singleNumber(nums);
		System.out.println(r);
	}

}
