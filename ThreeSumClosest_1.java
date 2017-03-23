package com.xjtuse.easy;

import java.util.Arrays;

public class ThreeSumClosest_1 {
	//³¬Ê±Òç³ö
	public static int threeSumClosest(int []nums, int target){
		
		Arrays.sort(nums);
		int delta=0,delta1=0,min=0;
		for(int i=0;i!=nums.length-2;i++){
			for(int j=i+1;j!=nums.length-1;j++){
				for(int k=j+1;k!=nums.length;k++){
					
					int sum=nums[i]+nums[j]+nums[k];
					delta=Math.abs(sum-target);
					if(k==2){
						delta1=delta;
						min=sum;
						continue;
					}
					if(delta<delta1){
						delta1=delta;
						min=sum;
					}
				}
			}

		}
		System.out.println(delta+target);
		System.out.println("min:"+min);
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={-1,2,1,-4};//1
//		int []nums={0,0,0};//0
//		int []nums={0,1,2};//3
		int []nums={1,1,-1,-1,3};
		int target=-1;
		threeSumClosest(nums,target);
	}

}
