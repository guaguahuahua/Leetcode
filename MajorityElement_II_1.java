package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II_1 {
	//boyer-moore vote algorithm
	public static List<Integer> majorityElement(int[]nums){
		List<Integer> res=new ArrayList<Integer>();
		if(nums.length==0){
			return res;
		}
		int count1=0,count2=0,m1=0,m2=0;
		for(int n:nums){
			if(m1==n){
				count1++;
			}else if(m2==n){
				count2++;
			}else if(count1==0){
				m1=n;
				count1=1;
			}else if(count2==2){
				m2=n;
				count2=1;
			}else{
				count1--;
				count2--;
			}
		}
		count1=0;
		count2=0;
		for(int n:nums){//第二次投票提取超过三分之n的元素
			if(n==m1){
				count1++;
			}else if(n==m2){
				count2++;
			}
		}
		if(count1>nums.length/3){
			res.add(m1);
		}
		if(count2>nums.length/3){
			res.add(m2);
		}
		for(int K:res){
			System.out.print(K+" ");
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,2,3,5,4,2,8,2,9,11,2,33,2};
		majorityElement(nums);
	}

}
