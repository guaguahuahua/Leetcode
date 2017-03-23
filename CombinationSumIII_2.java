package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII_2 {

	public static List<List<Integer>> combinationSum3(int k,int n){
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		combination(ans,new ArrayList<Integer>(),k,n,1);
		return ans;
	}
	private static void combination(List<List<Integer>> ans,ArrayList<Integer> list,int k,int target,int start){
		if(k==0 && target==0){
			ans.add( new ArrayList(list));
			return ;
		}
		
		for(int i=start; i<=9 && target>0 && k>0 ;i++){
			list.add(i);
			combination(ans,list,k-1,target-i,i+1);
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
