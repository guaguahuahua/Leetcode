package com.xjtuse.easy;

public class FactorialTrailingZeros {
	//���ֵ�С���ɣ�ֻҪ����5����5�ı���ĩβ�ͻ���0���֣����Կ��Ի������
	public static int trailingZeroes(int n){
		
		if(n<=0){
			return 0;
		}
		int res=fac(n);
		int tail=res%10,count=0;
		while(tail==0){//�������ڼ���׳˵ĺ�����������12�ͻᷢ��������������޷�ͳ��β����0����
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
