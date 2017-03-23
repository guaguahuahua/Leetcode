package com.xjtuse.easy;

public class MaxConsecutiveOnes {
	//只记录元素为1的时候累加的长度，其余的都不管。
	public static int findConsecutiveOnes(int []nums){
		int i=0;
		int length=0;
		int max=0;
		while(i<nums.length){
			if(nums[i]==0){//如果为零，那么直接将长度赋值给max，并清掉长度
				max=max>length?max:length;
				length=0;
				i++;
				continue;
			}
			if(nums[i]==1){//如果为1，那么长度增加，游标游移
				i++;
				length++;
			}
		}
		return max>length?max:length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,1,0,0,1,1,1,1};
		int max=findConsecutiveOnes(nums);
		System.out.println(max);
	}

}
