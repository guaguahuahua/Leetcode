package com.xjtuse.easy;

public class LongestUncommonSubsequence_I {

	public static int findLUSlength(String a,String b){
		
		
		if(a.length()==0 || b.length()==0){//�������һ���ַ���Ϊ�մ�����ôֱ���˳���
			return a.length()==0?b.length():a.length();
		}
		int []table=new int[26];//ʹ��hash��ʵ��
		int negative=0,positive=0;//�ֱ�ͳ�������͸���
		for(int i=0;i<a.length();i++){//��һ���ַ���д��
			table[a.charAt(i)-'a']++;
		}
		for(int i=0;i<b.length();i++){
			table[b.charAt(i)-'a']--;
		}
		for(int i=0;i<table.length;i++){//ͳ��hash�����ַ��ֲ����
			if(table[i]<0){
				negative+=table[i];
			}
			if(table[i]>0){
				positive+=table[i];
			}
		}
		if(negative==0 && positive==0){//"aaa" "aaa"�������������
			return -1;
		}
		return (-negative)>positive?(-negative):positive;//��������Ӵ�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="aba";
//		String b="cdc";
//		String a="avl";
//		String b="alavmling";
		String a="aaa";
		String b="aaa";
		int r=findLUSlength(a,b);
		System.out.println(r);
	}

}
