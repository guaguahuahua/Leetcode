package com.xjtuse.easy;

public class FactorialTrailingZeros_1 {

	//�㷨���裺��Ϊ���ɷ��ֻ����ӽ׳�ĩβ0����һ�㶼�� 5�ı�����ÿ��5������һ�Σ�������Ҫ���ľ��Ǽ��n�к��ж��ٸ�5�ı���
	//�Ӷ��ڵ�һ��ɸѡ��������������5�������Ѱ�һ����0������һֱ��nС��5��Ҳ�������޷�����5�ı�����
	public static int trailingZeroes(int n){
		
		int count=0;
		while(n!=0){
			n=n/5;
			count+=n;
			System.out.println(count);
		}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=40;
		trailingZeroes(n);
	}

}
