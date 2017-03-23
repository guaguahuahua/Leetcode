package com.xjtuse.easy;

public class MissingNumbers_1 {
	//if you wanna do xor operation ,firstly ,turn the decimal nums into binary nums
	//and attention that '2' should be transfer into 10,not 010,or you'll get the wrong
	//answer,actually i still don't find out how it works for it's really abstract
	
	
	//explaination:all the elenments is between 0 and n,so if nums[i] and i appeared twice,
	//then after xor operation ,result will be 0(i^i==0),if one element is missed,and the rest of the
	//pairs after xor operation is 0 and "0 ^ i==i" then the missing element is founded
	public static int MissingNumber(int []nums){
		
		int xor=0,i=0;
		for(;i<nums.length;i++){
			xor=xor^i;
			xor^=nums[i];
		}
		return xor^i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3};
		int []nums={0,1,3};
		int n=MissingNumber(nums);
		System.out.println(n);
	}

}
