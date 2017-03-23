package com.xjtuse.easy;

import java.util.Arrays;

public class ThreeSumClosest {
	public static int threeSumClosest(int []nums, int target){
		
		Arrays.sort(nums);
		int delta,closest=nums[0]+nums[1]+nums[2],min=0;
		for(int i=0;i!=nums.length;i++){
			for(int left=i+1,right=nums.length-1;left<right;){
				int sum=nums[i]+nums[left]+nums[right];
				delta=Math.abs(sum-target);
				if(delta==0){
					return sum;
				}else if(sum<target){
					while(left+1<right && sum<target){
						left++;
					}
					if(Math.abs(nums[i]+nums[left]+nums[right]-target)<Math.abs(closest-target)){
						closest=nums[i]+nums[left]+nums[right];
					}
					left++;
				}else if(sum>target){
					while(left+1<right && sum>target){
						right--;
					}
					if(Math.abs(nums[i]+nums[left]+nums[right]-target)<Math.abs(closest-target)){
						closest=nums[i]+nums[left]+nums[right];
					}
					right--;
				}
			}
		}
		System.out.println("closest:"+closest);
//		System.out.println("min:"+min);
		return closest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={-1,2,1,-4};
//		int []nums={0,0,0};
//		int []nums={0,1,2};
		int []nums={1,1,-1,-1,3};
		int target=-1;
		int r=threeSumClosest(nums,target);
		System.out.println("r:"+r);
	}

}
