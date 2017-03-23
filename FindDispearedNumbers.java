package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDispearedNumbers {
	
	//³¬Ê±Òç³ö
	public static List<Integer> findDisappearedNumbers(int []nums){
		int length=nums.length;
		List <Integer>list=new ArrayList<Integer>();
		for(int i=1;i<length+1;i++){//list(i) contains 1<=i<=n numbers 
			list.add(i);
		}

		for(int i=0;i<length;i++){//remove numbers that appeared in nums from list
			list.remove((Integer)nums[i]);
		}
		//Test
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i));
		}
		System.out.println();
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={4,3,2,7,8,2,3,1};
		int []nums={4,3,2,1};
		findDisappearedNumbers(nums);
	}

}
