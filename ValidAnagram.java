package com.xjtuse.easy;

public class ValidAnagram {

	public static boolean isAnagram(String s,String t){
		if(s.length()!=t.length()){
			return false;
		}		
		int []tables=new int [128];
		int []tablet=new int [128];
		int length=s.length();
		for(int i=0;i!=length;i++){
			int si=s.charAt(i);
			int ti=t.charAt(i);
			tables[si]+=1;
			tablet[ti]+=1;
		}
		for(int i=0;i!=128;i++){
			if((tables[i]==tablet[i])){
				continue;
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="anagram";
//		String t="nagaram";
//		String s="car";
//		String t="cat";
//		String s="map";
//		String t="mot";
//		String s="aacc";
//		String t="ccac";
//		String s="aa";
//		String t="bb";
		
		String s="cat";
		String t="act";
		boolean r=isAnagram(s,t);
		System.out.println(r);
	}

}
