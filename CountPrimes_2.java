package com.xjtuse.easy;

public class CountPrimes_2 {

	public static int countPrimes(int n){
		int count=0;
		byte []index=new byte[n];
		if(n<2){
			return count;
		}
		
		for(int i=2;i!=n;i++){
			if(index[i]!=1){//this is a prime number
				count++;
			}
			for(int j=i;j<n;j+=i){
				index[j]=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1500000;
//		int n=20;
//		int n=10;
//		int n=0;
//		int n=1;
		int r=countPrimes(n);
		System.out.println(r);
	}

}
