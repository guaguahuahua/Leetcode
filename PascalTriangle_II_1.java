package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II_1 {

	/**
	 * @param args
	 */
	public static List<Integer> getRow(int rowIndex){
		
		List <List<Integer>> list=new ArrayList<List<Integer>>();
		for(int i=0;i<=rowIndex;i++){//ÐÐºÅ
			List<Integer> l=new ArrayList<Integer>();
			for(int j=0;j<i+1;j++){//ÁÐ
				if(j==0||j==i){
					l.add(1);
				}else{
					l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
				}
			}
			list.add(l);
		}
		return list.get(rowIndex);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowIndex=15;
		System.out.println(getRow(rowIndex));
	}

}
