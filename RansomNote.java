package com.xjtuse.easy;

public class RansomNote {
	//ֻҪ�Ǵ�magazine��ȡ�õ��ַ��ܹ���ɣ����ransomNote �����ԣ�����Ҫ����������һ���ַ�,����Ҳ���ں�ǰ��˳��
	public static boolean canConstruct(String ransomNote, String magazine){
		
//		System.out.println(ransomNote+" "+magazine);
		if(ransomNote.equals("") && magazine.equals("")){//���������ǿ�
			return true;
		}
		int pointer=0;
		for(int i=0;i<magazine.length();i++){//ÿ�ζ���ͷ��β��Ѱ��magazine��
			
			if(ransomNote.equals("")){//���ransomNote��һ���մ�����magazine��Ϊ�յ�ʱ��
				break;
			}
			if(ransomNote.charAt(pointer)==magazine.charAt(i)){//�����magazine���ҵ��˿��Թ���ransomNote��Ԫ��
				pointer++;//����ָ��
			}
			if(pointer==ransomNote.length()){//����Ѿ��ҵ���ransomNote�е�����Ԫ�أ�ֱ�ӷ���
				return true;
			}
		}
		//�����ѭ���ж�û���ҵ�����Ԫ�أ���ôֱ�ӷ���false
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransom="a";
		String magazine="";
//		String magazine="aab";
//		String ransom="aa";

//		String magazine="a";
//		String ransom="b";
		
//		String magazine="aa";
//		String ransom="ab";
		
//		String ransom="fffbfg";
//		String magazine="effjfggbffjdgbjjhhdegh";
		
//		String ransom="a";
//		String magazine="";

		boolean r=canConstruct(ransom,magazine);
		System.out.println(r);
	}

}
