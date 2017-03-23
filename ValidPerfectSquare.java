package com.xjtuse.easy;

public class ValidPerfectSquare {
	//牛顿迭代法:通过该算法可以得到一个数的平方根，下一步通过使用split方式来判断该平方根是不是整数，如果是整数，那么小数点后应该是0，长度为1
	//一个重要的点就是：split函数控制的正则表达式，使用“.”号的时候
	//需要加\\才可以，因为该符号在Java中是特殊符（对象和属性的调用方法）
	public static boolean isPerfectSquare(int num){
		
		long s=System.currentTimeMillis();
		if(num==1){
			return true;
		}
		double x0=num/2,x1;
		x1=(x0+num/x0)/2;
		while(Math.abs(x0-x1)!=0){
			x0=x1;
			x1=(x0+num/x0)/2;
			System.out.println(x1);
		}
		long e=System.currentTimeMillis();
		System.out.println(e-s);
		String tmp=x1+"";
		String []t=tmp.split("\\.");
		if(t[1].length()!=1){
			System.out.println(false);
			return false;
		}
		System.out.println(true);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=16;
		int n=2147483647;
		boolean res=isPerfectSquare(n);
		System.out.println(res);
		Math.sqrt(n);
	}

}
