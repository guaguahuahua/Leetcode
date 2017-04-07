package com.xjtuse.easy;

public class RansomNote_1 {

	public static boolean canConstruct(String ransomNote, String magazine){
		
		int []table=new int[26];
		
		for(int i=0;i<magazine.length();i++){//根据magazine写入hash Table
			table[magazine.charAt(i)-'a']++;
		}
		for(int i=0;i<ransomNote.length();i++){//从hash table中寻找对应的字符，如果存在，那么直接取走1个（-1）
			table[ransomNote.charAt(i)-'a']--;
		}
		for(int i=0;i<table.length;i++){//如果因为magazine无法构造ransomNote那么一定会存在负数项
			if(table[i]<0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String ransom="a";
//		String magazine="";
//		String magazine="aab";
//		String ransom="aa";

//		String magazine="a";
//		String ransom="b";
		
//		String magazine="aa";
//		String ransom="ab";
		
//		String ransom="fffbfg";
//		String magazine="effjfggbffjdgbjjhhdegh";
		
		String ransom="a";
		String magazine="";

		boolean r=canConstruct(ransom,magazine);
		System.out.println(r);
	}

}
