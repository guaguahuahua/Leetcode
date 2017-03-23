package com.xjtuse.easy;

public class RotateArray_1 {
	//题目的意思是完成一次旋转，向右位移量是k
	public static void rotate(int []nums,int k){
		int l=0;
		k=k%nums.length;
		for(int i=nums.length-k;i<nums.length;i++){
			int temp=nums[i];
			for(int j=i;j>l;j--){
				nums[j]=nums[j-1];
			}
			nums[l]=temp;
			l++;
		}
		for(int z:nums){
			System.out.print(z+" ");
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,6,7};
//		int k=3;
		int []nums={1};
		int k=2;
		rotate(nums,k);
	}

}
