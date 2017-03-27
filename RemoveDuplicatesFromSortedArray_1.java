package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedArray_1 {

	public static int removeDuplicates(int []nums){
		
		if(nums.length==0){
			System.out.print(0);
			return 0;
		}
		int i=0,length=1,total=0;
		for(int j=1;j<nums.length;j++){
			
			if(nums[i]==nums[j]){
				length++;
			}else{
				if(length>2){
					total+=2;
					i+=2;
					nums[i]=nums[j];
					length=1;
				}else{
					total+=length;
					i+=length;
					nums[i]=nums[j];
					length=1;
				}
			}
		}
		total+=length>2?2:length;
		System.out.println("length:"+total);
		for(int K:nums){
			System.out.print(K+" ");
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,1,1,2,2,3};
//		int []nums={1,1,1,2,2,2};
//		int []nums={1,2};
//		int []nums={1,1,1,2};
//		int []nums={1,1,1,1,1,1,1,1,1};
		int []nums={1,1,1,1,3,3};
		removeDuplicates(nums);
	}
}
