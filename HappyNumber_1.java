package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber_1 {

	public static boolean isHappy(int n){
		byte []judge=new byte[1000];
		int result=calculate(n);
		
		while(judge[result]==0){
			n=result;
			judge[n]=1;
//			result=calculate(n);		
			if(n==1){
				return true;
			}else{
				result=calculate(n);
//				n=result;
			}
		}
		
		return false;
	}
	private static int calculate(int n){
		int sum=0;
		while(n!=0){
			sum+=(n%10)*(n%10);
			n/=10;
		}
		return sum;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		boolean r=isHappy(n);
		System.out.println(r);
	}

}
