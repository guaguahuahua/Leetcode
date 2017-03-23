package com.xjtuse.easy;

public class FactorialTrailingZeros_1 {

	//算法步骤：因为规律发现会增加阶乘末尾0的数一般都是 5的倍数（每隔5个出现一次），所以要做的就是检查n中含有多少个5的倍数
	//从而在第一步筛选出来的数里面再5个间隔的寻找会产生0的数。一直到n小于5，也就是再无法产生5的倍数。
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
