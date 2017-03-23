package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII_1 {
	public static List<List<Integer>> combinationSum3(int k,int n){
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		int []num={1,2,3,4,5,6,7,8,9};
		combination(ans,new ArrayList<Integer>(),num,k,n,0);
		return ans;
	}
	private static void combination(List<List<Integer>> ans,List<Integer>list,int []num,int k,int target,int start){    
		if(k==0 && target==0){
			List<Integer> li=new ArrayList<Integer>(list);
			ans.add(li);
			return ;
		}
		
		for(int i=start;i<num.length && target>0 && k>0;i++){
			list.add(num[i]);
			combination(ans,list,num,k-1,target-num[i],i+1);
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=9;
		System.out.println(combinationSum3(k,n));
	}

}
