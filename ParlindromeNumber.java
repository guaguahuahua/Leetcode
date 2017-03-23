package com.xjtuse.easy;

public class ParlindromeNumber {

	public static boolean isPalindrome(int x){
		
		if(x<0){
			x=-x;
		}
		String tran=x+"";
		int right=tran.length()-1,left=0;
		while(left<=right){
			char l=tran.charAt(left);
			char r=tran.charAt(right);
			if(l!=r){
				System.out.println(false);
				return false;
			}
			right--;
			left++;;
		}
		System.out.println(true);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-2147447412;
		isPalindrome(x);
	}

}
