package com.xjtuse.easy;

public class RomeToInteger {

	public static int romanToInt(String s){
		
		int len=s.length();
		int sum=0;
		while(len>0){
			if(s.charAt(len-1)=='I'){
				sum+=1;
			}else if(s.charAt(len-1)=='V'){
				sum+=5;
			}else if(s.charAt(len-1)=='X'){
				sum+=10;
			}else if(s.charAt(len-1)=='L'){
				sum+=50;
			}else if(s.charAt(len-1)=='C'){
				sum+=100;
			}else if(s.charAt(len-1)=='D'){
				sum+=500;
			}else if(s.charAt(len-1)=='M'){
				sum+=1000;
			}
			len--;
		}
//		System.out.println(sum);
		if(s.contains("IV")){
			sum-=2;
		}
		if(s.contains("IX")){
			sum-=2;
		}
		if(s.contains("XL")){
			sum-=20;
		}
		if(s.contains("XC")){
			sum-=20;
		}
		if(s.contains("CD")){
			sum-=200;
		}
		if(s.contains("CM")){
			sum-=200;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String roman="IV";
//		String roman="MMMCMXCIX";
		String roman="MCCCLXXIV";
		romanToInt(roman);
	}

}
