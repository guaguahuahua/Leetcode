package com.xjtuse.easy;

public class ValidPerfectSquare {
	//ţ�ٵ�����:ͨ�����㷨���Եõ�һ������ƽ��������һ��ͨ��ʹ��split��ʽ���жϸ�ƽ�����ǲ����������������������ôС�����Ӧ����0������Ϊ1
	//һ����Ҫ�ĵ���ǣ�split�������Ƶ�������ʽ��ʹ�á�.���ŵ�ʱ��
	//��Ҫ��\\�ſ��ԣ���Ϊ�÷�����Java�������������������Եĵ��÷�����
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
