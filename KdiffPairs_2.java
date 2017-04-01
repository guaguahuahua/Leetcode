package com.xjtuse.easy;

import java.util.HashSet;
import java.util.Set;

public class KdiffPairs_2 {
	//leetcode 社区算法
	public static int findPairs(int []nums, int k){
		
		//使用set主要是为了将重复的元素过滤掉，
		Set<Integer> diff=new HashSet<Integer>();//用来存放满足差距为k的元素
		Set<Integer> unique=new HashSet<Integer>();//存放过滤后的所有元素
		for(int i=0;i!=nums.length;i++){
			//每次都检查unique，是否存在比它大或者比它小k的元素。若存在就添加进diff中去
			if(unique.contains(nums[i]-k)){//总是存放最小的元素
				diff.add(nums[i]-k);
			}
			if(unique.contains(nums[i]+k)){
				diff.add(nums[i]);
			}
			unique.add(nums[i]);//存放每个唯一的nums[i]
		}
		System.out.println(diff.size());
		return k;
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
