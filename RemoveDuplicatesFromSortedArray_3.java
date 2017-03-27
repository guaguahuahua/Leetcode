package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedArray_3 {
	//算法来自于leetcode社区
	public static int removeDuplicates(int []nums){
		
		int i=0;
		for(int n:nums){//i的值不随循环每次改变，而是随着条件改变，符合条件才会变动。
			//所有的数是排好顺序的，前两个直接写到原位置，第三个的时候，i=2,取出第3个元素
			//和前两个进行比较，因为是递增的，如果大于（不相等），那么就就将该元素写入，否则
			//视为副本，重新取n 和最开始的两个元素比较
			if(i<2 || n>nums[i-2]){
				nums[i]=n;
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int []nums={1,1,1,2,2,3};
		removeDuplicates(nums);
	}
/*	public static int removeDuplicates(int []nums){
		//该算法是无副本的，每个元素都是唯一的
		int i=0;
		for(int n:nums){
			if(i<1 || n>nums[i-1]){
				nums[i]=n;
				i++;
			}
		}
		return i;
	}*/
}
