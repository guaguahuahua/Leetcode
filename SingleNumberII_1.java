package com.xjtuse.easy;

public class SingleNumberII_1 {

	public static int singleNumber(int []nums){
		int first=0,second=0;
		int length=nums.length;
		for(int i=0;i!=length;i++){
			int lastFirst=first;
			first=~second&(first^nums[i]);
			//(~second & lastFirst & nums[i])|(second & ~lastFirst & ~nums[i])->
			second=(~second & lastFirst & nums[i])|(second & ~lastFirst & ~nums[i]);
		}
		return first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={-1,2,1,2,3,-1,1,3,6,1,3,2,-1};
		int r=singleNumber(nums);
		System.out.println(r);
	}

}
