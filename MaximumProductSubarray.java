package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class MaximumProductSubarray {
	//use negetive nums to seperate the arrays and then plus and
	//compare which is lager;
	public static int maxProduct(int []nums){
		List <Integer>list=new ArrayList<Integer>(); //store the index of negetive nums 
		if(nums.length==1){
			return nums[0];
		}		
		for(int i=0;i<nums.length;i++){
			if(nums[i]<0){
				list.add(i);
			}
		}
		int count=0;
		int max=0;
		int index=0;
		int result=1;
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.get(i);j++){
				if(nums[j]==0){
					count=0;
					break;
				}
				count+=nums[j];
			}
			if(max<count){//get the largest subarray
				index=i;
			}
		}
		if(list.size()>1){
			for(int i=list.get(index-1);i<list.get(index);i++){
				result*=nums[i];
			}
		}else{
			for(int i=0;i<list.get(index);i++){
				result*=nums[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={2,3,-2,4};
		int []nums={-2};
		int r=maxProduct(nums);
		System.out.println(r);
	}

}
