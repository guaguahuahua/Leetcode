package com.xjtuse.easy;

public class ReverseStringII {
	//�㷨˼��������leetcode������
	public static String reverseStr(String s,int k){
		StringBuffer sb=new StringBuffer();//������Ž��
		int start=0,end;
		while(start<s.length()){
			//ǰk��Ԫ�ؽ�������
			end=start+k>s.length()?s.length():start+k;//����ǰk����Ҫ���õ�Ԫ�أ�����������ַ����ȣ���ôֱ��ȡ�ַ�����Ϊ���õĶ���
			sb.append(new StringBuffer(s.substring(start,end)).reverse());
			if(end>=s.length()){//���ǰ��k��Ԫ�أ����������ַ����ĳ��ȣ���ô���ý������˳���
				break;
			}
			start=end;//����ʼָ������ƶ���kλ�ã�
			end=start+k>s.length()?s.length():start+k;//���ϴεĶϵ㴦������ȡk��Ԫ��
			sb.append(s.substring(start,end));
			start=end;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="abcdefg";
		String s="ab";
		int k=2;
		String r=reverseStr(s,k);
		System.out.println(r);
//		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.append(s).reverse());
	}

}
