package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public static List<String>summaryRanges(int []nums){
		List <String>list=new ArrayList<String>();
		int n=nums.length;
		if(n==0){
			return list;
		}
		int i=0;//范围初始的指针
		int temp=nums[i];
		int count=1;//用来判断是否为单个孤立的整数
		String range="";
		for(int j=1;j!=n;j++){
		
			if(nums[j]==temp+1){
				temp++;
				count++;
				continue;
			}else{
				if(count!=1){
					range=nums[i]+""+"->"+temp;
				}
				if(count==1){
					range=nums[i]+"";
				}
				list.add(range);
				i=j;
				count=1;
				temp=nums[i];
			}
		}
		if(count!=1){//如果末尾是孤立整数或者是一段连续的序列，就会漏掉，
			range=nums[i]+""+"->"+temp;
		}
		if(count==1){
			range=nums[i]+"";
		}
		list.add(range);
		//test paras
		for(String K:list){
			System.out.print(K+" ");
		}System.out.println();
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={0,1,2,4,5,6};
//		int []nums={1,3,5,7};
		int []nums={};
		summaryRanges(nums);
	}

}
