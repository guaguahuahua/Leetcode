package com.xjtuse.easy;

public class LongestPalindromicSubstring {
	//˼�룺��������һ�ĶԱȣ�������˵��ַ���ͬ���ٽ�����ڶԱ�
	public static String longestPalindrome(String s){
		
		if(s.length()==1 || s.length()==0){
			System.out.println(s);
			return s;
		}
		int start=0,end=s.length()-1;//�������˵�ָ��
		String r="";
		while(end>start){//ÿ�ζ��Ƚ�����ָ������Ӧ���ַ��������ͬ����ô�Ƚ϶��ڣ�����startָ����ƣ���startָ���endָ��������end--��start��ͷ��ʼ
			while(start<end){
				if(s.charAt(start)==s.charAt(end)){//�����ȱȽ϶��ڵ��ַ�
					System.out.println(s.substring(start,end+1));//test
					System.out.println(isPalindrome(s.substring(start,end+1)));
					if(isPalindrome(s.substring(start,end+1))){//���ܻ��ҵ��������ģ�����ѡ�����
						if(s.substring(start,end+1).length()>r.length()){
							r=s.substring(start,end+1);
						}						
					}				
				}
				//�������end--
				end--;
			}
			start++;
			end=s.length()-1;
		}
		System.out.println(r==""?s.charAt(start)+"":r);
		return r==""?s.charAt(start)+"":r;
	}
	public static boolean isPalindrome(String s){//�ж��Ƿ�Ϊ����
		
		int left=0,right=s.length()-1;
		while(left<=right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="banana";
//		String s="babad";
//		String s="string";
//		String s="cbbd";
//		String s="";
//		String s="a";
		String s="babadada";
		longestPalindrome(s);
	}

}
