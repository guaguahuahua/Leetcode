package com.xjtuse.easy;

public class ReverseInteger {
	//˼�룺�����������������ת��Ϊ����ִ�У������ת��Ϊԭ�������ӣ��������Լ򻯹���
	public static int reverse(int x){
//		System.out.println(x);
		//�Ƚ������������ù���
		int Max=2147483647,Min=-2147483648;//��ʾ���ĺ���С������
		int Tmp=214748364,T=-214748364;//ʮ��֮һ�������С��

		int sum=0,right=0;//right�����õ�ÿһλ����sum�������������
		while(x!=0){
			right=x%10;
			x/=10;
			if(x==0){//�����㵽�����һλ��Ϊ�˱����10���������ֱ������ѭ��
				sum=sum+right;
				break;
			}
			sum=sum+right;
			if(sum>Tmp || sum<T){//�������͵Ĺ����У������˴���ʮ��֮һ�����С����ֵ����ôע�������
				return 0;//ֱ������ѭ��
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
