package com.xjtuse.easy;

public class ValidParentheses_1 {

	public static boolean isValid(String s){
		
		char []original=s.toCharArray();//ת�� Ϊ�ַ�������
		char []writein=new char[original.length];//д��һ�����ַ�����
		int pointer=0; //��������д���Լ��Ա�λ��
		for(int i=0;i!=original.length;i++){//���������ŵ�һ���ʱ��д�����ŵ���һ��
			if(original[i]=='('){
				writein[pointer++]=')';
			}else if(original[i]=='['){
				writein[pointer++]=']';
			}else if(original[i]=='{'){
				writein[pointer++]='}';
				//ָ����Ƶ����д��λ�ã������ǰ�����ź�д��Ĳ���ͬ��˵����ƥ�䡣�����ͳ����ˡ�
			}else if(pointer==0 || writein[--pointer]!=original[i]){
				//pointer��Ҫ����Կ�ʼ������)]}�������Σ����ֱ��--pointer��������
				System.out.println(false);
				return false;
			}
		}
		//�����е����Ŷ�ƥ���ϵ�ʱ��pointer�ֻ�ص�ԭλ��
		System.out.println(pointer==0);
		return pointer==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="()[]{}";
//		String s="(]{}";
//		String s="([)]";
//		String s="{";
//		String s="";
		String s="}";
		isValid(s);
	}

}
