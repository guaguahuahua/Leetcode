package com.xjtuse.easy;

public class FindDuplicate {
	//使用java的字符串处理函数转化后处理
	//还是无法完成，因为测试用例中包含了负数
	public static boolean containDuplicate(int []nums){
		String s="";
		for(int k:nums){
			s=s+k;
		}
		if(s.equals("")){
			return false;
		}
		System.out.println(s);//测试添加元素是否完成
		for(int i=0;i<s.length();i++){
			if(s.lastIndexOf(s.charAt(i))!=i){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,6,7};
		int []nums={1,1};
		boolean r=containDuplicate(nums);
		System.out.println(r);
	}

}
