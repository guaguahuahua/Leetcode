package com.xjtuse.easy;

public class NthDigit_1 {

	//算法思想来源于csdn，当初我也有这个想法，但是没有实施，因为不知道怎么实现。
	//http://blog.csdn.net/qq508618087/article/details/52582162
	//花了整整三个小时，最终的原因竟然是 改成long的数据类型即可
	public static int findNthDigit(int n){
		
		int nd=1;
		long start=1;
		long end=9;
		while(n>end*nd){//确定了目标是哪个位数的。
			n-=nd*end;//首先 n减去该位数的所有数
			nd++;
			start*=10;
			end*=10;
			System.out.println("n:"+n);
		}
		System.out.println(n);
		//确定目标在哪个数上面,n这个时候表示的是从初始值往后的一个长度。
		start+=(n-1)/nd;
		System.out.println(start);
		//确定在这个数的哪个位上面
		int tmp=(n-1)%nd;
		System.out.println(tmp);
		int r=(start+"").charAt(tmp)-'0';
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=18;
		int n=2147483647;
		findNthDigit(n);
	}

}
