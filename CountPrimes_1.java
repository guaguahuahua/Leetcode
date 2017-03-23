package com.xjtuse.easy;

public class CountPrimes_1 {
	//���ʹ����ɸ�������ǽ���������ΪԪ�أ���������Ԫ����Ϊ�˱��
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
				for(int j=2;j!=t;j++){//����ͨ�����ж���Ԫ�ص�ƽ������Χ���Ƿ������Ӧ�������ж��Ƿ�Ϊ����
					if(index[j]!=1){//�����Ż����㷨�����Ǳ�ȥ�����Ĳ��֣�
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
