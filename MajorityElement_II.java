package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement_II {
	//还是按照之前的思路，先进行排序，结束之后，统计相同元素出现的次数，如果超过了阈值，那么添加到list中去，否则重新计数
	public static List<Integer> majorityElement(int[]nums){
		List <Integer>list=new ArrayList<Integer>();
		int n=nums.length;
		int p=n/3;
		int length=1;//count 
		Arrays.sort(nums);
		int i=0;
		if(n==0){
			return list;
		}
		for(int j=1;j<n;j++){
			if(nums[i]==nums[j]){
				length++;
			}else{
				if(length>p){
					list.add(nums[i]);
					length=1;
					i=j;
				}else{
					i=j;
					length=1;
				}
			}
		}
		if(length>p){
			list.add(nums[i]);
		}
		// test para
		for(int i1=0;i1<list.size();i1++){
			System.out.print(list.get(i1)+" ");
		}System.out.println();

		//test para
		for(int K:nums){
			System.out.print(K+" ");
		}System.out.println();

		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,5,4,2,8,2,9,11,2,33,2};
//		int []nums={1,2,3,4,5};
		int []nums={3,2,3};
		majorityElement(nums);
//		System.out.println(nums.length);
	}

}
