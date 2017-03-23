package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams_2 {
	//社区的slide window 算法
	public static List<Integer> findAnagrams(String s,String p){
		List <Integer>list=new ArrayList<Integer>();
		int []table=new int[26];
		
		if(s.length()==0 || p.length()==0 || s==null || p==null){
			return list;
		}		
		for(int i=0;i!=p.length();i++){//initiate hash table
			table[p.charAt(i)-'a']++;	
		}
		int right=0,left=0;
		int count=p.length();
		while(right<s.length()){
			if(table[s.charAt(right)-'a']>=1){////
				count--;
			}
			table[s.charAt(right)-'a']--;////
			right++;
			if(count==0){
				list.add(left);
			}
			if(right-left==p.length()){
				if(table[s.charAt(left)-'a']>=0){
					count++;
				}
				table[s.charAt(left)-'a']++;
				left++;
			}
		}
		for(int K:list){
			System.out.print(K+"　");
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cbaebabacd";
		String p="abc";
		
//		String s="abab";
//		String p="ab";
//		String s="aaa";
//		String p="aaaaaa";
		findAnagrams(s,p);
	}

}
