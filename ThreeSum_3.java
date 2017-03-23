package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_3 {

	public static List<List<Integer>> threeSum(int []nums){
		
		Arrays.sort(nums);//make the array in order
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length-2;i++){
			int r=-nums[i];
			int left=i+1,right=nums.length-1;
			if(i>0 && nums[i]==nums[i-1]){//从源头上直接过滤相同元素进入
				continue;
			}
				while(left<right){//binary search
					int tmp=nums[left]+nums[right];
					if(tmp==r){
						ArrayList<Integer> inner=new ArrayList<Integer>();
						inner.add(nums[i]);
						inner.add(nums[left]);
						inner.add(nums[right]);
						outer.add(inner);
						left++;
						right--;
						while(left<right && nums[left]==nums[left-1]){//skip the same elements
							left++;
						}
						while(left<right && nums[right]==nums[right+1]){
							right--;
						}
					}else if(tmp<r){
						left++;			
					}else if(tmp>r){
						right--;
					}
				}
		}
		System.out.println(outer);
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={-1,0,1,2,-1,-4};
		int []nums={0,0,0};
		threeSum(nums);
	}

}
