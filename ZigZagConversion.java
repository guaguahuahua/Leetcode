package com.xjtuse.easy;

public class ZigZagConversion {
	//�㷨˼�룺ʹ�þ����ţ�Ȼ���ж�ȡ�����Ԫ�ؼ��ɣ������������Ϊs.length()/2,��Ϊ��̵�������2�����������Ҳ�͵õ���
	public static String convert(String s, int numRows){
		
		if(numRows==1){
			return s;
		}
		char [][]table=new char[numRows][s.length()];//��������ַ��ľ���
		int i=0,row=0,col=0;
		while(i<s.length()){
			for(row=0;row<numRows && i<s.length();){
				table[row++][col]=s.charAt(i++);//��һ��
			}
			col++;
			for(row=numRows-2;row>0 && i<s.length();){
				table[row--][col]=s.charAt(i++);
			}
			col++;
		}
		String result="";
		for(int r=0;r<table.length;r++){
			for(int c=0;c<table[r].length;c++){
				if(table[r][c]!='\0'){
					result+=table[r][c];
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="PAYPALISHIRING";
		String s="ABC";
//		String s="";
//		String r=convert(s,3);
		String r=convert(s,2);
		System.out.println(r);
	}
}
