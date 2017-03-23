package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedArray {
	//元素重复出现的最大次数为2次
	public static int removeDuplicates(int []nums){
		
		int length=0,count=1;
		int i=0,j;
		for(j=1;j!=nums.length;j++){
			if(nums[i]==nums[j]){//相等的情形下
				count++;
			}else{//不等,那么统计总的元素个数
				length+=count>=2?2:count;
				count=1;
//				System.out.println(length);
				i=j;
			}
		}
		System.out.println("count"+count+"j"+j);
		if(count==1 && i==nums.length-1 && j==nums.length){//原数组最后的是单个元素
			length+=1;
		}
		if(count!=1 && i<nums.length && j==nums.length){//数组最后是一组相同元素
			length+=count>=2?2:count;
		}
		System.out.println(length);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,1,1,2,2,3};
//		int []nums={1,1,1,2,2,2};
		int []nums={1,2};
		removeDuplicates(nums);
	}
}
