package com.xjtuse.easy;

public class LongestCommonPrefix {
	//Ѱ�������ַ����е������ǰ׺
	public static String longestCommonPrefix(String[] strs){
		
		if(strs.length==0){return "";}
		String r=strs[0];
		for(String K:strs){//�������е��ַ������ҵ���̵ĵ���
			r=K.length()<r.length()?K:r;
		}
//		System.out.println(r);
		for(int i=0;i!=strs.length;i++){//�ж���̵ĵ����ǲ��ǹ���ǰ׺
			if(!strs[i].startsWith(r)){//���ĳһ�����ʹ���ȥ����ôҪ���ľ��ǽ���С��̴����ȣ���������һ��
				r=r.substring(0,r.length()-1);
//				System.out.println(r);
				if(r==""){//���û�й�����ǰ׺����ô��󷵻��ǿմ�
					return "";
				}
				i--;
				continue;
			}
		}
		//���ǰ��û�з��أ���ô˵���й���ǰ׺�����ظ�ǰ׺
		System.out.println(r);
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String []strs={"antacid","antagonist","antarctic","ante","anteater","bant"};
//		String []strs={"antacid","antagonist","antarctic","ante","anteater"};/
		String []strs={};
		longestCommonPrefix(strs);
	}
}
