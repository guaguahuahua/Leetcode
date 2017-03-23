package com.xjtuse.easy;

public class RotateArray_2 {

	public static void rotate(int []nums,int k){
		k=k%nums.length;
		reverse(nums,0,nums.length-1);
		for(int l:nums){
			System.out.print(l+" ");
		}System.out.println();
		
		reverse(nums,0,k-1);
		for(int l:nums){
			System.out.print(l+" ");
		}System.out.println();
		
		reverse(nums,k,nums.length-1);
		for(int l:nums){
			System.out.print(l+" ");
		}
	}
	public static void reverse(int []nums,int begin,int end){
		int temp;
		for(int i=begin,j=end;i<=j;i++,j--){
			temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,6,7};
//		int k=3;
		int []nums={-1};
		int k=2;
		rotate(nums,k);
	}

}
