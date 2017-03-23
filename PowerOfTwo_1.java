package com.xjtuse.easy;

public class PowerOfTwo_1 {

	//社区算法，使用按位与操作，因为任何2的幂仅含有一个1，其余均为0
	
	public static boolean isPowerOfTwo(int x){
		
		int count=0;
		for(int i=0;i!=32;i++){
			count+=x&1;//判断该位是否为1，做位与的时候，1除了最右端以外，都是0，所以，如果一个数的最右端为1，那么结果为1，否则为0
			System.out.println(count);
			x=x>>1;//右移，
		}
		System.out.println(count);
		return count==1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		boolean result=isPowerOfTwo(x);
		System.out.println(result);
	}

}
