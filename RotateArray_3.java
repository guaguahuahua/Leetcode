package com.xjtuse.easy;

public class RotateArray_3 {
	//this method is concise and brilliant comes from leetcode community
	public static void rotate(int []nums,int k){
		
		int length=nums.length;
		int []newNum=nums.clone();
		k=k%length;
//		for(int i=0;i!=length;i++){
//			newNum[i]=nums[(length-k+i)%length];
//		}
		for(int i=0;i!=length;i++){
			nums[i]=newNum[(length-k+i)%length];
		}
		//test para
		for(int K:nums){
			System.out.print(K+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,6,7};
//		int k=3;
//		int []nums={-1};
//		int k=2;
		int []nums={1,2};
		int k=1;
		rotate(nums,k);
	}

}
