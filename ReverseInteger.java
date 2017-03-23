package com.xjtuse.easy;

public class ReverseInteger {
	//思想：将所有输入的数进行转化为正数执行，最后再转化为原来的样子，这样可以简化过程
	public static int reverse(int x){
//		System.out.println(x);
		//先进行正数的逆置过程
		int Max=2147483647,Min=-2147483648;//表示最大的和最小的整数
		int Tmp=214748364,T=-214748364;//十分之一的最大最小数

		int sum=0,right=0;//right用来得到每一位数，sum将他们重新求和
		while(x!=0){
			right=x%10;
			x/=10;
			if(x==0){//当计算到了最后一位，为了避免乘10溢出，所以直接跳出循环
				sum=sum+right;
				break;
			}
			sum=sum+right;
			if(sum>Tmp || sum<T){//如果在求和的过程中，出现了大于十分之一最大最小数的值，那么注定会溢出
				return 0;//直接跳出循环
			}
			sum*=10;
			System.out.println(sum);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=-321;
//		int x=1534236462;
//		int max=4294967295;
		int x=-2147483648;
		int result=reverse(x);
		System.out.println("result:"+result);
	}

}
