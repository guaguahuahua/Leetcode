package com.xjtuse.easy;

public class SearchInsertPosition {
	//solution 1£ºordinary way,my own method to tackle
	public static int searchInsert(int []nums,int target){
		int len=nums.length;
		if(target<nums[0]){//smaller than the left end
			return 0;
		}
		if(target>nums[len-1]){//bigger than the right end
			return len;
		}
		for(int i=0,j=0;i<len;i++){
			if(target==nums[i]){
				return i;
			}
			if(target>nums[j] && target<nums[i]){
				return i;
			}
			j=i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,3,5,6};
		int target=0;
		int r=searchInsert(nums,target);
		System.out.println(r);
		
	}

}
