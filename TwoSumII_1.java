package com.xjtuse.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII_1 {
	public static int[]twoSum(int[] numbers,int target){
		int []result=new int[2];
		Map map=new HashMap();	
		for(int i=0;i!=numbers.length;i++){
			int second=target-numbers[i];
			if(map.containsKey(second)){
				result[1]=i+1;
				result[0]=(Integer) map.get(second)+1;
				return result;
			}
			map.put(numbers[i], i);
		}

		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={0,0,3,4};
		int target=0;
		int []r=twoSum(nums,target);
		for(int K:r){
			System.out.print(K+" ");
		}
		System.out.println();
	}

}
