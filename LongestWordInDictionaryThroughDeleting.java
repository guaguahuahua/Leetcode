package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
	//�㷨˼�룬��ͨ������forѭ����Ѱ�ұȽϴ�
	public static String findLongestWord(String s, List<String> d){
		
		String r="";
		for(String K:d){//�������е��ֵ�Ԫ��
			
			//��������һ���������ʱ������һ�߿�ʼ��
			int j=0;//����ֵ䵥���Ƿ������s��
			for(int i=0;i<s.length();i++){
				if(j<K.length() && s.charAt(i)==K.charAt(j)){
					j++;
				}
			}
			if(j==K.length()){//j==K.length˵�� ���ʵ�����λ���������������s�д����ֵ䵥�ʣ���ô�Ƚ�˭�����������ʱ�����r
				if(r!=""){
					if(K.length()>r.length()){//���K���ȴ���r��ֱ�Ӹ�ֵ
						r=K;
					}else if(K.length()==r.length()){ //�������ʱ����ô�Ƚ��ֵ���
						r=r.charAt(0)>K.charAt(0)?K:r;
					}
				}else{//��rΪ��ʱ��ֱ�ӱȽ��ַ������ȣ����Ƚ��ֵ���
					r=K.length()>r.length()?K:r;//ԭʼ�ж�
				}
				
			}
		}
		System.out.println(r);
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> d=new ArrayList<String>();
//		d.add("ale");
//		d.add("apple");
//		d.add("monkey");
//		d.add("plea");
		
//		d.add("a");
//		d.add("b");
//		d.add("c");
		
		d.add("m");
		d.add("n");
		d.add("o");
		String s="abpcplea";
		
//		d.add("ba");
//		d.add("ab");
//		d.add("a");
//		d.add("b");
//		String s="bab";
		findLongestWord(s,d);
	}

}
