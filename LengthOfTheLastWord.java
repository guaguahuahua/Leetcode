package com.xjtuse.easy;

public class LengthOfTheLastWord {

	public static int lengthOfLastWord(String s){
		
		System.out.println(s.length());
		int space=0;//统计从字符串最右端到最后一个单词之间的空格
		boolean went=false;//标记是否已经进行了空格统计
		if(s.length()!=0){
			int i;
			for(i=s.length()-1;i>=0;){//字符串从最后位置开始向前遍历
				if(s.charAt(i)==' ' && went==false){//一开始结尾是字符时，吃掉所有的空字符
					i--;
					space++;//统计从最右侧开始多少个空格
				}else if(s.charAt(i)!=' '){//如果是非空字符，将标志位置为真
					i--;
					went=true;
				}else if(s.charAt(i)==' ' && went==true){//如果该情况满足，那么说明得到了最后一个单词
					break;
				}
			}//            i最后位置
			//计算过程 "sfsfsf word*******";
			System.out.println(s.length()-space-i-1);
			return s.length()-space-i-1;
		}
		//如果长度为0，那么返回0
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
