package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
	// two method to solve this problem ,first hash table, second sum(failed,beacause sum(af)==sum(be))
	public static List<Integer> findAnagrams(String s,String p){
		List<Integer>list=new ArrayList<Integer>(); 
		int p_len=p.length();// the shorter length
		int length=s.length()-p_len+1;
		if(length<0){
			return list;
		}
		int sum=0;
		for(int i=0;i!=p_len;i++){//sum the string p
			sum+=p.charAt(i);
		}
		
		for(int i=0;i!=length;i++){
			int temp=0;
			for(int j=i;j!=p_len+i;j++){//sum the same length of string s
				temp+=s.charAt(j);
			}
			if(temp==sum){
				list.add(i);
			}
		}
		for(int K:list){
			System.out.print(K+" ");
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="cbaebabacd";
//		String p="abc";
		
//		String s="abab";
//		String p="ab";
		String s="aaa";
		String p="aaaaaa";
		findAnagrams(s,p);
	}

}
