package com.xjtuse.easy;

public class ExcelSheetColumnTitle {

	public static String convertToTitle(int n){
		//首先应该注意：起始值为1，对应的字符为A
		char []alph={'0','A','B','C','D','E','F','G',
				'H','I','J','K','L','M','N','O',
				'P','Q','R','S','T','U','V','W',
				'X','Y','Z'};
		String res="";
		int tmp=0;
		while(n!=0){
			tmp=n%26;
			if(tmp==0){//解决26的倍数问题
				n--;
				tmp=26;
			}
			res=alph[tmp]+res;
			n/=26;
		}
		System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=28;
//		int n=24568;//AJHX
		int n=26;
		convertToTitle(n);
	}

}
