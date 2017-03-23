package com.xjtuse.easy;

public class FactorialTrailingZeros {
	//发现的小规律：只要存在5或者5的倍数末尾就会有0出现，所以可以化简程序
	public static int trailingZeroes(int n){
		
		if(n<=0){
			return 0;
		}
		int res=fac(n);
		int tail=res%10,count=0;
		while(tail==0){//问题在于计算阶乘的函数，超过了12就会发生溢出，溢出后就无法统计尾部的0个数
			count++;
			res/=10;
			tail=res%10;
		}
		
		System.out.println(res);
		System.out.println(count);
		return 0;
	}
	public static int fac(int n){
		if(n==1){
			return 1;
		}
		return n*fac(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		trailingZeroes(n);
	}

}
