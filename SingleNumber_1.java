package com.xjtuse.easy;

public class SingleNumber_1 {

	public static int singleNumber(int []nums){
		int singleNumber=0;
		int length=nums.length;
		for(int i=0;i!=length;i++){
			singleNumber^=nums[i];
		}
		return singleNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,-1,1,2,3,-1,3};
		int r=singleNumber(nums);
		System.out.println(r);
	}

}
