package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

	public static int singleNumber(int []nums){
		List <Integer>list=new ArrayList<Integer>();
		int length=nums.length;
		for(int i=0;i!=length;i++){
			if(!list.contains(nums[i])){//if this element doesn't exist,add
				list.add(nums[i]);
			}else{//if this element already exist ,remove 
				list.remove((Object)nums[i]);
			}
		}		
		return list.get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,-1,1,2,3,-1,3};
		int r=singleNumber(nums);
		System.out.println(r);
	}

}
