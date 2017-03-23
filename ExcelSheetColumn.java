package com.xjtuse.easy;

public class ExcelSheetColumn {

	public static int titleToNumber(String s){
		
		int i,sum=0;
		
		for(i=0;i<s.length();i++){
			sum=sum*26+(s.charAt(i)-'A'+1);
		}
//		for(i=0;i!=s.length()-1;i++){
//			sum+=(s.charAt(i)-'A')*26;
//			sum+=Math.pow(26, i);
//			System.out.println(sum);
//		}
//		sum+=Math.pow(26,i);
//		sum+=s.charAt(i)-'A';
//		System.out.println(sum);
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AJHX";
		titleToNumber(s);
	}

}
