package com.xjtuse.easy;

public class LongestPalindromicSubstring_3 {
/*	�㷨����leetcode��������������Ѱ�Ҷ�Ӧ��ͬ���ַ������Ǵ��ַ�������Ѱ�ң�������ÿ���ַ����ж���������ַ��ǲ��ǶԳƵģ���
 * ����ǣ����¼�������ж��¸��ַ��������ͼ�����һ��ѭ�����ǳ�����
 */
	private static int l=0;
	private static int r=0;
	public  static String longestPalindrome(String s) {
		
		if(s=="" || s.length()==1){//ֻ��һ���ַ����߿մ�ʱ��ֱ�ӷ��ر���
			return s;
		}
		int start,left,right;
		for(start=0;start<s.length();start++){//startָ����Ա������е��ַ�
			right=start+1;
			left =start-1;//��ø��ַ�����ָ��
			judgePalindrome(s,left,right);
			judgePalindrome(s,start,start+1);//���cbbc�������Σ�ǰ��Ĵ��ַ����࿪ʼ�޷���⵽���ֿ�����
		}
		return s.substring(l,r+1);
	}
	
	public static void judgePalindrome(String s,int left,int right){
		while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){//�ж��ַ��Ƿ�Խ�磬���������ַ�Ҫ���
			left--;
			right++;//���ϵĽ������ָ����������ɢ
		}
		left++;
		right--;
		if(left>=0 && right<=s.length()-1 && (right-left)>(r-l)){//����µ��ַ�����֮ǰ�Ĵ�Ҫ������ô���´�����ɴ�
//			result=s.substring(left,right+1);
			l=left;
			r=right;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="banana";
//		String s="babad";
//		String s="string";
//		String s="cbbd";
//		String s="";
//		String s="a";
//		String s="babadada";
		String s="bb";
		String r=longestPalindrome(s);
		System.out.println(r);
	}
}
