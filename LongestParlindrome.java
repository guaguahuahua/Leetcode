package com.xjtuse.easy;

public class LongestParlindrome {

	public static int longestPalindrome(String s){
		
		int []table=new int [128];
		int length=s.length();
		
		for(int i=0;i!=length;i++){
			table[s.charAt(i)]++;
		}
		int longest=0;//count the length of parlindrome
		for(int i=0;i!=128;i++){
			if(((table[i]>>1)<<1)==table[i]){//table[i]%2==0
				longest+=table[i];
			}else{//if odd,only even number can be used
				longest+=table[i]-1;
			}
		}
		return longest<length?longest+1:longest;//if odd add 1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="abccccdd";
//		String s="Aa";
//		String s="a";
//		String s="ccc";
//		String s="abc";
//		String s="bananas";
		String s="aaabbbccc";
		int len=longestPalindrome(s);
		System.out.println(len);
	}

}
