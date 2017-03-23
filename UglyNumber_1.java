package com.xjtuse.easy;

public class UglyNumber_1 {

	public static boolean isUgly(int num){
		
//		if(num==1){
//			System.out.println(true);
//			return true;
//		}
		if(num==0){
			System.out.println(false);
		    return false;
		}
		while(num!=1){
			if(num%2==0){
				num/=2;
			}else if(num%3==0){
				num/=3;
			}else if(num%5==0){
				num/=5;
			}else{
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=237590332;
		int num=1;
		isUgly(num);
	}

}
