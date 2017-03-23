package com.xjtuse.easy;

public class RemoveDuplicates_1 {
	public static int removeDuplicates(int [] nums){
		int i=0;//作为长度标
		int j=1;//作为遍历游标
		for(;j<nums.length;j++){
			if(nums[j]==nums[i]){//两数相等了，游标后移
				continue;
			}else{//不相等的时候，长度标后移覆盖一位数，
				i++;
				nums[i]=nums[j];
			}
		}
		return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums={1,2,2,5,6,6,7};//源数据
//		int []nums={1,1,2};
		int result=removeDuplicates(nums);
		System.out.println(result);
	}

}
