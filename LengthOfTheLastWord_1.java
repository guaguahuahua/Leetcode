package com.xjtuse.easy;

public class LengthOfTheLastWord_1 {

	public static int lengthOfLastWord(String s){

		
		String []array=s.split(" ");
		System.out.println(array.length);
//		System.out.println(array[0]);
//		System.out.println(array[1]);
		if(array.length==0){
			System.out.println(0);
			return 0;
		}
		System.out.println(array[array.length-1].length());
		return array[array.length-1].length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="hello World  ";
//		String s=" here     ";
//		String s="           ";
//		String s="            a";
		String s="a";
		lengthOfLastWord(s);
	}

}
