package com.xjtuse.easy;

public class ReverseString {

    public static String reverseString(String s) {
		StringBuffer sb=new StringBuffer();
		for(int si=s.length()-1;si!=-1;si--){
			sb.append(s.charAt(si));
		}
        return sb.toString() ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		reverseString(s);
	}

}
