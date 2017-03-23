package com.xjtuse.easy;

public class ArragingCoins {
	
	public static int arrangeCoins(int n){
		
		int i=0;
		for(;n-i>=0;i++){
			n-=i;
		}
		System.out.println(i-1);
//		if(n==0){
//			return n;
//		}
//		if(n==2){
//			return n-1;
//		}
//		int i=0;
//		while((i+1)*i<=n){
//			i++;
//		}
//		System.out.println(i);
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		arrangeCoins(n);
	}

}
