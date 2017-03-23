package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	//排序之后，两个for循环，内嵌一个两边同时递进查找算法
	public static List<List<Integer>> fourSum(int []nums, int target){
		
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		Arrays.sort(nums);//首先进行排序，方便使用两边推进求和算法
		for(int i=0;i<nums.length-3;i++){
			if(i>0 && nums[i]==nums[i-1]){//这是跳过相同元素，也就是说当开始第二个元素的时候，如果和前面的元素相同，那么直接跳过
				continue;
			}
			for(int j=i+1;j<nums.length-2;j++){
				if(j>i+1 && nums[j]==nums[j-1]){
					continue;
				}
				for(int left=j+1,right=nums.length-1;left<right;){//使用两边求和算法，这样能比双层 的for循环减少时间复杂度，
					if(nums[i]+nums[j]==target-(nums[left]+nums[right])){
						//如果outer 里面没有该元素的时候再添加进去，主要是为了满足题目的要求，无副本
//						if(!outer.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right]))){
//							outer.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
//						}
						outer.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
						left++;//如果该元素符合要求，那么左右的指针向均向各自的方向推进一位
						right--;
					}else if(nums[i]+nums[j]<target-(nums[left]+nums[right])){//移项后看能清楚点。
						//这块是当做指针不超过右指针的情形下，移动指针，尽量减小当前值和目标值的间距
						while(left<right && nums[i]+nums[j]<target-(nums[left]+nums[right])){
							left++;
						}
					}else if(nums[i]+nums[j]>target-(nums[left]+nums[right])){
						
						while(left<right && nums[i]+nums[j]>target-(nums[left]+nums[right])){
							right--;
						}
					}
				}
			}
		}
		System.out.println(outer);
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,0,-1,0,-2,2};//0
//		int []nums={-3,-2,-1,0,0,1,2,3};//0
//		int []nums={-1,0,1,2,-1,-4};//-1
		int target=0;
		fourSum(nums,target);
	}

}
