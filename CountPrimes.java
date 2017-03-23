package com.xjtuse.easy;

public class CountPrimes {
	//使用筛法统计素数的时候时间超出限制，改为传统方式
	public static int countPrimes(int n){
		int count=0;
		boolean tag=true;
		
		
		for(int i=2;i!=n;i++){
			int t=(int) Math.sqrt(i)+1;
			for(int j=2;j!=t;j++){
				if(i%j==0){
					tag=false;
					break;
				}
			}
			if(tag){
				count++;
			}
			tag=true;
		}
	
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1500000;
//		int n=20;
		int r=countPrimes(n);
		System.out.println(r);
	}

}
