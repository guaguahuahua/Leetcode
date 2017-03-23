package com.xjtuse.easy;

public class PowerOfThree {

	public static boolean isPowerOfThree(int n){
		
		if(n<=0){
			return false;
		}
		while(n!=1){
			if(n%3!=0){
				System.out.println(false);
				return false;
			}
			n/=3;
		}
		System.out.println(true);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		isPowerOfThree(n);
	}

}
