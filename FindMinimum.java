package com.xjtuse.easy;

public class FindMinimum {
	//duplicates exist in this array
	public static int findMin(int []nums){
		int left=0;
		int right=nums.length-1;
		int mid=0;
		while(left<=right){
			mid=(left+right)/2;
			if(nums[mid]>nums[right]){
				left=mid+1;
			}else if(nums[mid]<nums[right]){
				right=mid-1;
			}else{//nums[right]==nums[mid] for example :6666666 1234566
				right--;
			}
		}
		return nums[left];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={4,5,6,7,0,1,2};
		int r=findMin(nums);
		System.out.println(r);
	}
}
