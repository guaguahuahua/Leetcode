package com.xjtuse.easy;

public class LengthOfTheLastWord {

	public static int lengthOfLastWord(String s){
		
		System.out.println(s.length());
		int space=0;//ͳ�ƴ��ַ������Ҷ˵����һ������֮��Ŀո�
		boolean went=false;//����Ƿ��Ѿ������˿ո�ͳ��
		if(s.length()!=0){
			int i;
			for(i=s.length()-1;i>=0;){//�ַ��������λ�ÿ�ʼ��ǰ����
				if(s.charAt(i)==' ' && went==false){//һ��ʼ��β���ַ�ʱ���Ե����еĿ��ַ�
					i--;
					space++;//ͳ�ƴ����Ҳ࿪ʼ���ٸ��ո�
				}else if(s.charAt(i)!=' '){//����Ƿǿ��ַ�������־λ��Ϊ��
					i--;
					went=true;
				}else if(s.charAt(i)==' ' && went==true){//�����������㣬��ô˵���õ������һ������
					break;
				}
			}//            i���λ��
			//������� "sfsfsf word*******";
			System.out.println(s.length()-space-i-1);
			return s.length()-space-i-1;
		}
		//�������Ϊ0����ô����0
		System.out.println(0);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello World";
//		String s=" here     ";
//		String s="           ";
//		String s="            a";
//		String s="a";
		lengthOfLastWord(s);
	}

}
