package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams_1 {
	public static List<Integer> findAnagrams(String s,String p){
		
		List<Integer>list=new ArrayList<Integer>(); 
		int p_len=p.length();// the shorter length
		int []table=new int[26];
		int length=s.length()-p_len+1;
		
		if(p.length()>s.length() || s==null || p==null || s.length()==0 || p.length()==0){//if p.length>s.length
			return list;
		}
		for(int i=0;i!=length;i++){
			for(int j=i;j!=p_len+i;j++){
				table[s.charAt(j)-'a']++;
				table[p.charAt(j-i)-'a']--;
			}
			boolean tag=true;
			for(int j=0;j!=26;j++){
				if(table[j]!=0){
					table[j]=0;
					tag=false;
				}
			}
			if(tag){//if true,found a anagram part
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
