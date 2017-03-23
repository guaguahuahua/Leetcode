package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

	public static boolean isHappy(int n){
		int oldSum=n;
		int newSum;
		List<Integer> list=new ArrayList<Integer>();
		while(!list.contains(oldSum)){
			list.add(oldSum);
			newSum=0;
			String s=oldSum+"";
			for(int i=0;i!=s.length();i++){
				newSum+=(s.charAt(i)-'0')*(s.charAt(i)-'0');
			}
			//test para
			System.out.println(newSum);
			if(newSum==1){
				return true;
			}else if(list.contains(newSum)){
				return false;
			}else{
				oldSum=newSum;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		boolean r=isHappy(2);
		System.out.println(r);
	}

}
