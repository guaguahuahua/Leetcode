package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle__1 {

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list=new ArrayList<List<Integer>>();
    	int e=1;//行元素
    	for(int i=0;i<numRows;i++){//行
    		List <Integer>l=new ArrayList<Integer>();//某一行的元素
    		for(int j=0;j<i+1;j++){//列
    			if(j==0||j==i){
    				l.add(1);
    			}else{
    				l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
    			}
    		}
    		list.add(l);//将该行的元素添加到list中去
    	}
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows=20;
		System.out.println(generate(numRows));
	}

}
