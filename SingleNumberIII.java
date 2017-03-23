package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {

	public static int[] singleNumber(int [] nums){
		int []result=new int[2];
		int length=nums.length;
		List <Integer>list=new ArrayList<Integer>();
		for(int i=0;i!=length;i++){
			if(!list.contains(nums[i])){
				list.add(nums[i]);
			}else{
				list.remove((Object)nums[i]);
			}
		}
		result[0]=list.get(0);
		result[1]=list.get(1);
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,2,1,3,2,5};
		int []r=singleNumber(nums);
		for(int k:r){
			System.out.print(k+" ");
		}System.out.println();
	}

}
