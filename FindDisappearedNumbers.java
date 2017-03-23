package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

	public class FindDisappearedNumbers {
	//转化成为字符串来处理，因为数组中元素的范围是1 to n;
	//two sets minus  
	//使用list添加，
	public static List<Integer> findDisappearedNumbers(int []nums){
		Set <Integer>s1=new HashSet<Integer>();
		Set <Integer>s2=new HashSet<Integer>();
		List <Integer>list=new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++){
			s1.add(i+1);// contains 1 to n 
			s2.add(nums[i]); //contains numbers from []nums
		}
		s1.removeAll(s2);// s1 now contains disappeared elements
		Iterator it=s1.iterator();
		while(it.hasNext()){ //add the disappeared elements to list 
			list.add((Integer)it.next());
		}
		//test
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={4,3,2,7,8,2,3,1};
		int []nums={4,3,2,1};
		findDisappearedNumbers(nums);
	}

}
