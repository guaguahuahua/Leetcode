package com.xjtuse.easy;

public class LongestCommonPrefix {
	//寻找所有字符串中的最长公共前缀
	public static String longestCommonPrefix(String[] strs){
		
		if(strs.length==0){return "";}
		String r=strs[0];
		for(String K:strs){//遍历所有的字符串，找到最短的单词
			r=K.length()<r.length()?K:r;
		}
//		System.out.println(r);
		for(int i=0;i!=strs.length;i++){//判断最短的单词是不是公共前缀
			if(!strs[i].startsWith(r)){//如果某一个单词过不去，那么要做的就是将减小最短串长度，重新再试一次
				r=r.substring(0,r.length()-1);
//				System.out.println(r);
				if(r==""){//如果没有公共的前缀，那么最后返回是空串
					return "";
				}
				i--;
				continue;
			}
		}
		//如果前面没有返回，那么说明有公共前缀，返回该前缀
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
