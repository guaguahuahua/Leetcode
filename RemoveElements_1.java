package com.xjtuse.easy;

public class RemoveElements_1 {

	public static int removeElement(int []nums,int val){
		int l=0;
		//算法思想是，如果碰到一个非val元素，那么直接从0位置开始放置，直到元素遍历完为止。
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[l]=nums[i];
				l++;
			}
		}
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={3,2,2,3};
		int val=3;
		int length=removeElement(nums,val);
		System.out.println(length);
	}

}
