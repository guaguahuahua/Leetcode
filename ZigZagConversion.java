package com.xjtuse.easy;

public class ZigZagConversion {
	//算法思想：使用矩阵存放，然后按行读取矩阵的元素即可，矩阵最大列数为s.length()/2,因为最短的行数是2所以最大列数也就得到了
	public static String convert(String s, int numRows){
		
		if(numRows==1){
			return s;
		}
		char [][]table=new char[numRows][s.length()];//创建存放字符的矩阵
		int i=0,row=0,col=0;
		while(i<s.length()){
			for(row=0;row<numRows && i<s.length();){
				table[row++][col]=s.charAt(i++);//第一列
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
