package com.xjtuse.easy;

public class UglyNumber {
	
	//Ëã·¨³¬Ê±Òç³ö
	public static boolean isUgly(int num){
		
		if(num==1 || num==2 ||num==3 ||num==5){
			System.out.println(true);
			return true;
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
		int num=1;
		isUgly(num);
	}

}
