package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class SortWithLinkedList_1 {
	// linkedList is the same with ArrayList in implement
	public static void raidSort(int []nums,int length){
		List <Integer>l=new ArrayList<Integer>();
		for(int i=0;i!=nums.length;i++){
			l.add(nums[i]);
		}
		List []list=new ArrayList[10];
		for(int i=0;i!=list.length;i++){
			list[i]=new ArrayList<Integer>();;
		}
		int devide=1;
		while(length>0){
			
			for(int i=0;i!=l.size();i++){//sort
				int t=((Integer)l.get(i)/devide)%10;
				list[t].add(l.get(i));
			}
			l.clear();//after sort clean all elements in the list l;;
			for(int i=0;i!=list.length;i++){//collect
				l.addAll(list[i]);
				list[i].clear();//clean all the data before add in list[i]
			}
			length--;
			devide*=10;
		}
		for(int K:l){
			System.out.print(K+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={123,122,25,89,77,117,347,249,349,322};
		raidSort(nums,3);
	}

}
