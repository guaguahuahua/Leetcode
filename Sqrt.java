package com.xjtuse.easy;

public class Sqrt {
	//算法是使用牛顿迭代法 Xn+1=（Xn+a/Xn）/2 给定最后的精度，小数点后4位
	public static int mySqrt(int x){
		
		if(x==0 || x<0){
			return 0;
		}
		System.out.println(x);
		
		double x0=((double)x)/2,x1=0;
		
		boolean flag=true;
		while(flag){
			x1=(x0+x/x0)/2;
			if(Math.abs(x0-x1)<0.00001){
				flag=false;
			}else{
				x0=x1;
			}
		}
		
		System.out.println(x0);
		return (int)x0;
		
//		int r=(int) Math.sqrt(x);
//		System.out.println(r);
//		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=0;
//		int x=1074541823;
		int x=2147395599;
		mySqrt(x);
	}

}
