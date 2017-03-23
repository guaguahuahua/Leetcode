package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CombinationSumIII {
	//可以使用 3层for循环来解决，但是时间复杂度会大
	//如果直接使用for循环解决的时候会出现很多问题，这时可以试试递归，
	public static List<List<Integer>> combinationSum3(int k,int n){
		List outside=new ArrayList();
		int []array={1,2,3,4,5,6,7,8,9};

		for(int i=0;i<n-1;i++){//当k=3时候，三层嵌套
			for(int j=i+1;j<n-1;j++){
				for(int m=j+1;m<n-1;m++){
					List<Integer>inside=new ArrayList<Integer>();
					if(array[i]+array[j]+array[m]==n){
						inside.add(array[i]);
						inside.add(array[j]);
						inside.add(array[m]);
						outside.add(inside);
					}
				}
			}
		}
		
		System.out.println(outside);
		return outside;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=9;
		Random r=new Random();
//		combinationSum3(k,n);
		for(int i=0;i<3;i++){
			System.out.print(r.nextInt(7)+" ");
		}
	}

}
