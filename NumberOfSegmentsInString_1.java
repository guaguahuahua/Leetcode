package com.xjtuse.easy;

public class NumberOfSegmentsInString_1 {

	public static int countSegments(String s){
		
		int word=0;//ͳ�Ƶ��ʵĸ���
		int space=0;
		if(!s.equals("")){
			for(int i=0;i<s.length();i++){//���ݿո���ͳ�������������ǰ�ַ��ǿո���ǰһ���ַ����ǿգ���ôword+1
				
				if((i==0 || s.charAt(i-1)==' ')&& s.charAt(i)!=' '){
					word++;
				}
//				}else if(s.charAt(i)==' '){
//					space++;
//				}
			}
//			return word==0?0:word+1;//���������Ϊ�˿˷���������Σ���ֹ���ֶ���ո�ʱ����1����������ڡ�hello�����ֲ����пո�����������޷�ͨ����
//			if(space==s.length()){//����ȫ���ǿո�Ĵ���û�пո�Ĵ�
//				return 0;
//			}
			return word;//���ʹ��������ʽ��ô��������ɶ���ո���ɵĴ���������1�������0
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="hello my name is john";
//		String s="             ";
//		String s=", , , ,        a, eaefa";
//		String s="    foo    bar";
		String s="hello";
		int r=countSegments(s);
		System.out.println(r);
	}

}
