package com.xjtuse.easy;

public class DetectCapital_1 {
//	public static boolean detectCapitalUse(String word){
//		
//		if(word.length()<2){//������ʵĳ���Ϊ1����0
//			return true;
//		}
//		if(word.toLowerCase().equals(word)){//����ȫ��ΪСд���ַ���
//			return true;
//		}
//		//�������ַ�Ϊ��д�����������ȫ��ΪСд��Ϊ��һ�����Σ����Ϊ��д�����ǵڶ������Σ�
//		if(word.substring(1).toLowerCase().equals(word.substring(1)) || word.substring(1).toUpperCase().equals(word.substring(1))){
//			return true;
//		}
//		return false;
//	}
	public static boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;
        if (word.toUpperCase().equals(word)) return true;
        if (word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String word="usa";
		String word="USa";
//		String word="google";
//		String word="Google";
//		String word="FlaG";
//		String word="Usa";
//		String word="";
		boolean r=detectCapitalUse(word);
		System.out.println(r);
	}

}
