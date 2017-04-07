package com.xjtuse.easy;

public class DetectCapital_1 {
//	public static boolean detectCapitalUse(String word){
//		
//		if(word.length()<2){//如果单词的长度为1或者0
//			return true;
//		}
//		if(word.toLowerCase().equals(word)){//处理全部为小写的字符串
//			return true;
//		}
//		//处理首字符为大写，后面如果是全部为小写，为第一种情形；如果为大写，则是第二种情形；
//		if(word.substring(1).toLowerCase().equals(word.substring(1)) || word.substring(1).toUpperCase().equals(word.substring(1))){
//			return true;
//		}
//		return false;
//	}
	public static boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;
        if (word.toUpperCase().equals(word)) return true;
        if (word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String word="usa";
		String word="USa";
//		String word="google";
//		String word="Google";
//		String word="FlaG";
//		String word="Usa";
//		String word="";
		boolean r=detectCapitalUse(word);
		System.out.println(r);
	}

}
