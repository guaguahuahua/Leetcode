package com.xjtuse.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs_1 {
	//之前理解错了题目意思，以为间距只有1，后来才慢慢弄清楚这是个什么鬼东西，看来一开始不能出现重要错误，否则将南辕北辙
	//要求如下：求三个点，其中1，2两点间距等于1，3两点间距。具体算法如下：
	//首先将求出到某point点距离相等的所有点，然后从中任选两个，也就是2*C(n,2);2的含义是，每一个三元组都有两种排列
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
