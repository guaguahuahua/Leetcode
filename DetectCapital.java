package com.xjtuse.easy;

public class DetectCapital {

	public static boolean detectCapitalUse(String word){
		
		if(word==""){//����ַ���Ϊ�գ���Ϊʹ����ȷ
			return true;
		}
		//���ʵĳ��Ȳ���һ�� �ַ�
		boolean up=true,low=true;
		if(word.charAt(0)>='A' && word.charAt(0)<='Z'){//��һ�����Σ������ַ��Ƿ��д
			
			for(int i=1;i<word.length();i++){//�ӵڶ�λ�ж���ȫ����д���ǽ����ַ���д
				if(word.charAt(i)>='A' && word.charAt(i)<='Z' && up){//����ڶ�λ�Ǵ�д�ģ���ô����ֻ���Ǵ�д�ַ�
					low=false;
				}else if(word.charAt(i)>='a' && word.charAt(i)<='z' && low){//����ڶ�λ��Сд����ô����ֻ����Сд
					up=false;
				}else{//�����˻�ϵ�����
					return false;
				}
			}
		}else if(word.charAt(0)>='a' && word.charAt(0)<='z'){//�ڶ��֣����ַ�Сд
			for(int i=1;i<word.length();i++){//�ӵڶ�λ��ʼ�ж��Ƿ��д�д�ַ���������
				if(word.charAt(i)>='A' && word.charAt(i)<='Z'){//�����˴�д�ַ�
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String word="usa";
//		String word="USa";
//		String word="google";
//		String word="Google";
//		String word="FlaG";
//		String word="Usa";
		String word="";
		boolean r=detectCapitalUse(word);
		System.out.println(r);
	}

}
