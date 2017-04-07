package com.xjtuse.easy;

public class DetectCapital {

	public static boolean detectCapitalUse(String word){
		
		if(word==""){//如果字符串为空，视为使用正确
			return true;
		}
		//单词的长度不是一个 字符
		boolean up=true,low=true;
		if(word.charAt(0)>='A' && word.charAt(0)<='Z'){//第一种情形，看首字符是否大写
			
			for(int i=1;i<word.length();i++){//从第二位判断是全部大写还是仅首字符大写
				if(word.charAt(i)>='A' && word.charAt(i)<='Z' && up){//如果第二位是大写的，那么后面只能是大写字符
					low=false;
				}else if(word.charAt(i)>='a' && word.charAt(i)<='z' && low){//如果第二位是小写，那么后面只能是小写
					up=false;
				}else{//出现了混合的情形
					return false;
				}
			}
		}else if(word.charAt(0)>='a' && word.charAt(0)<='z'){//第二种，首字符小写
			for(int i=1;i<word.length();i++){//从第二位开始判断是否有大写字符混杂其中
				if(word.charAt(i)>='A' && word.charAt(i)<='Z'){//出现了大写字符
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
