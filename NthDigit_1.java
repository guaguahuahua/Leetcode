package com.xjtuse.easy;

public class NthDigit_1 {

	//�㷨˼����Դ��csdn��������Ҳ������뷨������û��ʵʩ����Ϊ��֪����ôʵ�֡�
	//http://blog.csdn.net/qq508618087/article/details/52582162
	//������������Сʱ�����յ�ԭ��Ȼ�� �ĳ�long���������ͼ���
	public static int findNthDigit(int n){
		
		int nd=1;
		long start=1;
		long end=9;
		while(n>end*nd){//ȷ����Ŀ�����ĸ�λ���ġ�
			n-=nd*end;//���� n��ȥ��λ����������
			nd++;
			start*=10;
			end*=10;
			System.out.println("n:"+n);
		}
		System.out.println(n);
		//ȷ��Ŀ�����ĸ�������,n���ʱ���ʾ���Ǵӳ�ʼֵ�����һ�����ȡ�
		start+=(n-1)/nd;
		System.out.println(start);
		//ȷ������������ĸ�λ����
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
