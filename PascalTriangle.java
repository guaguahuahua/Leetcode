package com.xjtuse.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	//������֤����ÿ����Ҫ���������ڲ���list��ӵ��ⲿ��listʱ�ŷ���������
	//ʹ�ö���ʽչ����ɣ�
	//ʹ�������������ʱ��ͻᵼ������������Ҫ���ڽ׳˵ļ������棬����ֱ��ʹ�ö���չ���ᵼ������������Ŀǰ�һ�û����ؾ��鴦��
    public static List<List<Integer>> generate(int numRows) {
		List list=new ArrayList();// ����list
    	for(int i=0;i<numRows;i++){
    		List <Integer>l=new ArrayList<Integer>();//�ڲ��list 
    		for(int j=0;j<i+1;j++){//������������е�Ԫ��
    			int t;
    			if(j==0){
    				t=1;
    			}else{
    				t=fac(i,j)/fac(j,j);
//    				t=fac(i-1)/(fac(j)*fac(i-j-1));
    			}
    			l.add(t);
    		}
    		list.add(l);//�����е�Ԫ�ط��õ����list
    	}
    	
    	return list;        
    }
    public static int fac(int i,int j){//i��������j���ϱ�
    	int result=1;
    	for(int k=0;k<j;k++){
    		result=result*(i);
    		i--;
    	}
    	return result;
    }
    
    //���ַ��������У�ԭ���ǶԵ������
/*    public static int fac(int n){//�����Ľ׳�
    	BigInteger ONE;
    	if(n<0){//����Ϊ�������ز��������쳣
    		throw new IllegalArgumentException("argument must be an positive integer!");
    	}
    	if(n==0){//������Ϊ1ʱ������Ϊ1
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
