package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle__1 {

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list=new ArrayList<List<Integer>>();
    	int e=1;//��Ԫ��
    	for(int i=0;i<numRows;i++){//��
    		List <Integer>l=new ArrayList<Integer>();//ĳһ�е�Ԫ��
    		for(int j=0;j<i+1;j++){//��
    			if(j==0||j==i){
    				l.add(1);
    			}else{
    				l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
    			}
    		}
    		list.add(l);//�����е�Ԫ����ӵ�list��ȥ
    	}
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows=20;
		System.out.println(generate(numRows));
	}

}
