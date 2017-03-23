package com.xjtuse.easy;

public class MaximumSubarray {
	//this problem belongs to dynamic planning(DP),and the following method comes from
	//leetcode community,
	public static int maxSubArray(int []nums){
		int max=nums[0];
		int sum=nums[0];
		int length=nums.length;
		

		for(int i=1;i!=length;i++){
			if(sum<0){//if sum is negative,we don't plus,it's useless
				sum=nums[i];
			}else{//we plus only if the sum is positive
				sum+=nums[i];
				max=Math.max(sum,max);
			}
//			sum=Math.max(sum+nums[i],nums[i]);
//			max=Math.max(sum,max);
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={-2,1,-3,4,-1,2,1,-5,4};//result={4,-1,2,1}
//		int []nums={-2,1};
		int []nums={-1,-2};
		int result=maxSubArray(nums);
		System.out.println(result);
	}

}
