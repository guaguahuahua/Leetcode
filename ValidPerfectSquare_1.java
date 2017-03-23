package com.xjtuse.easy;

public class ValidPerfectSquare_1 {

	//算法收敛速度很慢，不行，有一个二分法求解平方根的算法。
	public static boolean isPerfectSquare(int num){
		
		int i;
		for(i=0;i*i<num;i++){
		}
		System.out.println(i*i);
		return i*i==num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		boolean r=isPerfectSquare(n);
		System.out.println(r);
	}

}
