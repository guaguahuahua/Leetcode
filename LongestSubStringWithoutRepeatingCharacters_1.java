package com.xjtuse.easy;

import java.util.ArrayList;

public class LongestSubStringWithoutRepeatingCharacters_1 {
	//TLE
	public static int lengthOfLongestSubstring(String s){
		
		int max=0;
		for(int i=0;i<s.length();i++){
			String tmp="";
			for(int j=i;j<s.length();j++){
				if((tmp.indexOf(s.charAt(j))==-1)){
					tmp=tmp+s.charAt(j);
				}else{
					break;
				}
				if(max<tmp.length()){
					max=tmp.length();
				}
			}
			System.out.println(tmp);

		}
		System.out.println(max);
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcbb";
//		String s="bbbbb";
//		String s="pwwkew";
		lengthOfLongestSubstring(s);
	}
}
