package com.xjtuse.easy;

public class SearchInsertPosition_1 {
	//use binary search to accomplish the problem
	public static int searchInsert(int []nums,int target){
		int left=0;
		int right=nums.length-1;
		int mid=0;
		
		while(left<=right){
			mid=left+(right-left)/2;
			if(target==nums[mid]){
				return mid; 
			}else if(target<nums[mid]){
				right=mid-1;//if the variable doesn't minus 1,it won't work
			}else{
				left=mid+1;//so is here
			}
		}
		return left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,3,5,6};
		int target=2;
		int r=searchInsert(nums,target);
		System.out.println(r);
	}

}
