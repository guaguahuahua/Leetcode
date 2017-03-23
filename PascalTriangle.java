package com.xjtuse.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	//经过验证发现每次需要重新生成内部的list添加到外部的list时才符合条件。
	//使用二项式展开完成，
	//使用整型数过大的时候就会导致溢出情况，主要是在阶乘的计算上面，所以直接使用二项展开会导致溢出，而这个目前我还没有相关经验处理
    public static List<List<Integer>> generate(int numRows) {
		List list=new ArrayList();// 外层的list
    	for(int i=0;i<numRows;i++){
    		List <Integer>l=new ArrayList<Integer>();//内层的list 
    		for(int j=0;j<i+1;j++){//计算出该行所有的元素
    			int t;
    			if(j==0){
    				t=1;
    			}else{
    				t=fac(i,j)/fac(j,j);
//    				t=fac(i-1)/(fac(j)*fac(i-j-1));
    			}
    			l.add(t);
    		}
    		list.add(l);//将该行的元素放置到外层list
    	}
    	
    	return list;        
    }
    public static int fac(int i,int j){//i是行数，j是上标
    	int result=1;
    	for(int k=0;k<j;k++){
    		result=result*(i);
    		i--;
    	}
    	return result;
    }
    
    //这种方法不可行，原因是对导致溢出
/*    public static int fac(int n){//求函数的阶乘
    	BigInteger ONE;
    	if(n<0){//参数为负，返回参数错误异常
    		throw new IllegalArgumentException("argument must be an positive integer!");
    	}
    	if(n==0){//当参数为1时，返回为1
    		return 1;
    	}
    	return n*fac(n-1);
    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows=14;
		System.out.println(generate(numRows));	
		
		int result=fac(13,11);
		System.out.println(result);
	}

}
