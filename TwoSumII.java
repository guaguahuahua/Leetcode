package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;


//input array is sorted
public class TwoSumII {

	public static int[]twoSum(int[] numbers,int target){
		int []result=new int[2];
		List <Integer>list=new ArrayList<Integer>();
//		for(int i=0;i!=numbers.length;i++){
//			list.add(numbers[i]);
//		}
//		for(int i=0;i!=list.size();i++){
//			int second=target-list.get(i);
//			if(list.contains(second)){
//				result[0]=i+1;
//				result[1]=list.lastIndexOf(second)+1;
//				return result; 
//			}
//		}
		for(int i=0;i!=numbers.length;i++){
			int second=target-numbers[i];
			if(list.contains(second)){
				result[0]=list.lastIndexOf(second)+1;
				result[1]=i+1;
				return result;
			}
			list.add(numbers[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={2,7,11,15};
		int target=9;
//		int []nums={0,0,3,4};
//		int target=0;
		int []r=twoSum(nums,target);
		for(int K:r){
			System.out.print(K+" ");
		}
		System.out.println();
	}

}
