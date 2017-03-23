package com.xjtuse.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II {

	/**
	 * @param args
	 */
	//方法1：直接使用二项式展开计算系数，使用大整数防止溢出。
	public static List<Integer>getRow(int rowIndex){
		List <Integer>list=new ArrayList<Integer>();//将目标行存入到list中去
		BigInteger rowNum=new BigInteger("3");//将行号转化为大整数
		BigInteger ONE=new BigInteger("1");
		BigInteger up;
		BigInteger down;
		BigInteger t = null;
		//使用参数rowNum直接计算该行的所有元素
		for(int j=0;j<rowIndex+1;j++){
			if(j==0){
				BigInteger temp=new BigInteger("1");//每行的第一个元素置为1
			}else{
				
				up=ONE;
				for(int i=0;i<j;i++){//计算阶乘的分子部分
					up=up.multiply(rowNum);
					rowNum=rowNum.subtract(ONE);
				}
				
				
				down=ONE;
				BigInteger m=new BigInteger("j");
				for(int k=0;k<j;k++){//计算阶乘的分母部分
					down=down.multiply(m);
					m=m.subtract(ONE);
				}
				t=up.divide(down);
			}
			list.add(Integer.valueOf(t.toString()));
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowIndex=3;
		System.out.println(getRow(rowIndex));
	}

}
