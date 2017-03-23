package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf {
	//˫��forѭ��������ÿ�ν���λ�õ�Ԫ����Ϊ1������֮��Ԫ�ظ�λ
	public static int[] productExceptSelf(int []nums){
		int []result=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			int temp=nums[i];
			int product=1;
			nums[i]=1;
			for(int j=0;j<nums.length;j++){
				product*=nums[j];
			}
			result[i]=product;
			nums[i]=temp;
		}
		
		//for test
		for(int K:result){
			System.out.print(K+" ");
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,2,3,4,5,6,7,8,9};
		productExceptSelf(nums);
	}

}
