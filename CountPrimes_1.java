package com.xjtuse.easy;

public class CountPrimes_1 {
	//这次使用了筛法，但是将索引号作为元素，而将数组元素作为了标记
	public static int countPrimes(int n){
		byte []index=new byte[n];
		int count=0;
		if(n<2){
			return count;
		}
		
		boolean tag=true;
		for(int i=2;i!=n;i++){
			if(index[i]!=1){
				int t=(int)Math.sqrt(i)+1;
				for(int j=2;j!=t;j++){//我是通过了判读该元素的平方根范围内是否存在相应因子来判定是否为素数
					if(index[j]!=1){//而在优化的算法中这是被去除掉的部分，
						if(i%j==0){
							tag=false;
							break;
						}
					}
				}
				if(tag){
					count++;
					for(int k=i;k<n;k+=i){
						index[k]=1;
					}
				}
				tag=true;
			}
		}

		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=1500000;
//		int n=20;
//		int n=10;
//		int n=0;
		int n=1;
		int r=countPrimes(n);
		System.out.println(r);
	}

}
