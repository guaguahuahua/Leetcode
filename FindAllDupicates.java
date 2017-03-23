package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDupicates {
	//算法思想：首先使用array 的排序函数将所有的元素从小到大进行排序，排序完成之后
	//找到一个元素，统计出现次数，等于两次的添加到list中去，否则游标继续后移
	public static List<Integer>findDuplicates(int[] nums){
		List <Integer>list=new ArrayList();
		Arrays.sort(nums);
		int length=1;//
		int i=0;//
		for(int j=1;j<nums.length;j++){
			if(nums[i]==nums[j]){
				length++;
			}
			if(nums[i]!=nums[j]){
				if(length==2){//add expeceted elements to list
					list.add(nums[i]);
				}
				
				i=j;
				length=1;//clear record
				continue;
			}
		}
		if(length==2){// e.g: an array end with consecutive elements
			list.add(nums[i]);
		}
		
		//Test
		for(int v:list){
			System.out.print(v+" ");
		}System.out.println();
		
		
		
		//测试段代码
		for(int k:nums){
			System.out.print(k+" ");
		}

		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={4,3,2,7,8,2,3,1};
		int []nums={1,1,2,2};
		findDuplicates(nums);
	}

}
