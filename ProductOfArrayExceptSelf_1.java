package com.xjtuse.easy;

public class ProductOfArrayExceptSelf_1 {

	public static int[] productExceptSelf(int []nums){
		int n=nums.length;
		int []result=new int[n];
		
		result[0]=1;//the first got no left 
		result[n-1]=1;//the last got no right
		for(int i=1;i<n;i++){//calculate left
			result[i]=result[i-1]*nums[i-1];
		}
		int right=1;
		for(int j=n-2;j>=0;j--){//calculate right and calculate result
			right=right*nums[j+1];
			result[j]=result[j]*right;
		}
		//test
		for(int I:result){
			System.out.print(I+" ");
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={2,3,4,5};
		productExceptSelf(nums);
	}

}
