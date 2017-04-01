package com.xjtuse.easy;

import java.util.Arrays;

public class KdiffPairs_1 {

	public static int findPairs(int []nums, int k){
		
		int count=0;
//		Arrays.sort(nums);//对所有的元素进行排序
		for(int i=0;i<nums.length-1;i++){//
			
			if(i>0 && nums[i]==nums[i-1]){//外层循环，跳过相同的元素
				continue;
			}
			
			for(int j=i+1;j<nums.length;j++){
				if(j>i+1 && nums[j]==nums[j-1]){//内层循环，跳过相同的元素
					continue;
				}
				if(nums[j]-nums[i]==k){//如果两个数的差等于给定的k值
					count++;
					System.out.println(nums[i]+" "+nums[j]);
				}
			}
		}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={3,1,4,1,5};//0,2
//		int []nums={1,2,3,4,5};//1
//		int []nums={1,1,1,2,1};
//		int []nums={1,1,1,1};//0
		findPairs(nums,2);
	}

}
