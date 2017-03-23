package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers_1 {
	//高端解法：由于所有的元素都是在1——n的范围，所以根据该特性将nums所有的元素进行遍历标记为对应的相反数，第一次循环完成
	//第二次循环，从0开始再次遍历所有的元素，那么未被标记过的元素的索引就是缺失的元素，
	public static List<Integer>findDisappearedNumbers(int []nums){
		List <Integer>list =new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++){
			int val=Math.abs(nums[i])-1;//如果缺失就会导致取出负元素进行操作
			if(nums[val]>0){  //如果缺失会导致将负数置为正
				nums[val]=-nums[val];
			}
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				list.add(i+1);
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}

}
