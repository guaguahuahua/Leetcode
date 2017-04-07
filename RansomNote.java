package com.xjtuse.easy;

public class RansomNote {
	//只要是从magazine中取得的字符能够完成，组成ransomNote 都可以，并不要求是连续的一串字符,并且也不在乎前后顺序
	public static boolean canConstruct(String ransomNote, String magazine){
		
//		System.out.println(ransomNote+" "+magazine);
		if(ransomNote.equals("") && magazine.equals("")){//两个串都是空
			return true;
		}
		int pointer=0;
		for(int i=0;i<magazine.length();i++){//每次都从头到尾的寻找magazine，
			
			if(ransomNote.equals("")){//如果ransomNote是一个空串，而magazine不为空的时候，
				break;
			}
			if(ransomNote.charAt(pointer)==magazine.charAt(i)){//如果在magazine中找到了可以构成ransomNote的元素
				pointer++;//后移指针
			}
			if(pointer==ransomNote.length()){//如果已经找到了ransomNote中的所有元素，直接返回
				return true;
			}
		}
		//如果在循环中都没有找到所有元素，那么直接返回false
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
