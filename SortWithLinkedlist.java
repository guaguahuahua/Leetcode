package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;
//linkedlist can add another linkedlist to its end but we don't implement it at this place
public class SortWithLinkedlist {
	
	public static void raidSort(int []nums,int length){
		List []list=new ArrayList[10];
		for(int i=0;i!=list.length;i++){
			list[i]=new ArrayList();//initiate ArrayList
		}
		int devide=1;
		while(length>0){
			for(int i=0;i!=nums.length;i++){//sort
				int t=(nums[i]/devide)%10;//the unit place
				list[t].add(nums[i]);
			}
			int k=0;//index of nums
			for(int i=0;i!=list.length;i++){
				
				for(int j=0;j<list[i].size();j++){
					nums[k++]=(Integer)list[i].get(j);
				}
				list[i].clear();
			}
			devide*=10;
			length--;
		}
		for(int K:nums){
			System.out.print(K+"¡¡");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={123,122,25,89,77,117,347,249,349,322};
		raidSort(nums,3);
	}

}
