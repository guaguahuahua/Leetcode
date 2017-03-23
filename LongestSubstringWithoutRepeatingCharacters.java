package com.xjtuse.easy;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {
	//TLE
	public static int lengthOfLongestSubString(String s){
		
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=0;i<s.length();i++){
			String tmp="";
			for(int j=i;j<s.length();j++){
				if((tmp.indexOf(s.charAt(j))==-1)){
					tmp=tmp+s.charAt(j);
				}else{
					break;
				}
			}
			System.out.println(tmp);
			list.add(tmp);
		}
		int max=0;
		for(int i=0;i<list.size();i++){
			if(max<list.get(i).length()){
				max=list.get(i).length();
			}
			System.out.println(max);
		}
		System.out.println(max);
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="abcabcbb";
//		String s="bbbbb";
		String s="pwwkew";
		lengthOfLongestSubString(s);
	}

}
