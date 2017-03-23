package com.xjtuse.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs_1 {
	//֮ǰ��������Ŀ��˼����Ϊ���ֻ��1������������Ū������Ǹ�ʲô����������һ��ʼ���ܳ�����Ҫ���󣬷�����ԯ����
	//Ҫ�����£��������㣬����1��2���������1��3�����ࡣ�����㷨���£�
	//���Ƚ������ĳpoint�������ȵ����е㣬Ȼ�������ѡ������Ҳ����2*C(n,2);2�ĺ����ǣ�ÿһ����Ԫ�鶼����������
	public static int numberOfBoomerangs(int [][]points){
		int count=0;
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i!=points.length;i++){
			for(int j=0;j!=points.length;j++){
				if(i==j){
					continue;
				}
				//calculate distance
				int deltax=points[i][0]-points[j][0];
				int deltay=points[i][1]-points[j][1];
				int square=deltax*deltax+deltay*deltay;
				if(map.containsKey(square)){
					map.put(square, map.get(square)+1);
				}else{
					map.put(square,1);
				}
			}
			for(int value:map.values()){//2*C(n,2)
				count+=value*(value-1);
			}
			map.clear();
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]points={{0,0},{1,0},{-1,0},{0,1},{0,-1}};
		System.out.println(numberOfBoomerangs(points));
	}

}
