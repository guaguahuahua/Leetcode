package com.xjtuse.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II {

	/**
	 * @param args
	 */
	//����1��ֱ��ʹ�ö���ʽչ������ϵ����ʹ�ô�������ֹ�����
	public static List<Integer>getRow(int rowIndex){
		List <Integer>list=new ArrayList<Integer>();//��Ŀ���д��뵽list��ȥ
		BigInteger rowNum=new BigInteger("3");//���к�ת��Ϊ������
		BigInteger ONE=new BigInteger("1");
		BigInteger up;
		BigInteger down;
		BigInteger t = null;
		//ʹ�ò���rowNumֱ�Ӽ�����е�����Ԫ��
		for(int j=0;j<rowIndex+1;j++){
			if(j==0){
				BigInteger temp=new BigInteger("1");//ÿ�еĵ�һ��Ԫ����Ϊ1
			}else{
				
				up=ONE;
				for(int i=0;i<j;i++){//����׳˵ķ��Ӳ���
					up=up.multiply(rowNum);
					rowNum=rowNum.subtract(ONE);
				}
				
				
				down=ONE;
				BigInteger m=new BigInteger("j");
				for(int k=0;k<j;k++){//����׳˵ķ�ĸ����
					down=down.multiply(m);
					m=m.subtract(ONE);
				}
				t=up.divide(down);
			}
			list.add(Integer.valueOf(t.toString()));
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowIndex=3;
		System.out.println(getRow(rowIndex));
	}

}
