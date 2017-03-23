package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II_2 {

	/**
	 * @param args
	 */
	//使用了O(k)复杂度的算法
	public static List<Integer>getRow(int rowNum){
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<=rowNum;i++){
			list.add(0,1);
			for(int j=1;j<list.size()-1;j++){
				list.set(j,list.get(j)+list.get(j+1));
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowNum=3;
		System.out.println(getRow(rowNum));
	}

}
