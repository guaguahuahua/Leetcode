package com.xjtuse.easy;

public class FindTheDifference {

	public static char findTheDifference(String s,String t){
		byte []table=new byte[26];
		int length=s.length();
		int i;
		for(i=0;i!=length;i++){
			table[s.charAt(i)-'a']++;
			table[t.charAt(i)-'a']--;
		}
		System.out.println(i);
		
		while(i<t.length()){
			table[t.charAt(i)-'a']--;
			i++;
		}
		int j=0;
		for(j=0;j!=26;j++){
			if(table[j]!=0){
				return (char) ('a'+j);
			}
		}
		return (char) ('a'+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String t="abcde";
		char res=findTheDifference(s,t);
		System.out.println(res);
	}

}
