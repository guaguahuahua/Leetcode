package com.xjtuse.easy;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int x){
		
		if(x<=0){//首先确定1 是2的0次幂
			System.out.println(false);
			return false;	
		}
		if(x==1){
			return true;
		}
		if(x%2!=0){
			System.out.println(false);
			return false;
		}
		int tmp=0;
		while(tmp==0){//仅剩下2,4,6,8,.....
			tmp=x%2;
			x/=2;
			if(tmp!=0 && x!=0){
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		isPowerOfTwo(x);
	}

}
