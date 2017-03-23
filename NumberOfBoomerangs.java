package com.xjtuse.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {
	//
	public static int numberOfBoomerangs(int [][]points){
		int []h=new int[points.length];
		int []v=new int[points.length];
		int equal=0;
		for(int i=0;i!=points.length;i++){
			h[i]=points[i][0];
			v[i]=points[i][1];
			equal+=(h[i]==v[i])?1:0;
		}
		Arrays.sort(h);
		Arrays.sort(v);

		int count=0,vcount=0;
		int len=1,vlen=1;
		int i=0;
		for(int j=1;j!=points.length;j++){
			if(h[i]+1==h[j]){//horizon
				len++;
			}else{
				int delta=len-3;
				count+=delta>=0?delta+1:0;
				len=0;
			}
			if(v[i]+1==v[j]){//vertical
				vlen++;
			}else{
				int delta=vlen-3;
				vcount+=delta>=0?delta+1:0;
				vlen=0;
			}
			i=j;
		}
		if(len>=3){
			int delta=len-3;
			count+=delta>=0?delta+1:0;
		}
		if(vlen>=3){
			int delta=vlen-3;
			vcount+=delta>=0?delta+1:0;
		}
		if(equal==h.length){
			vcount=0;
		}
		return 2*(count+vcount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][]points={{0,0},{1,0},{2,0}};
//		int [][]points={{1,1},{2,2},{3,3}};
		int [][]points={{0,0},{1,0},{-1,0},{0,1},{0,-1}};
//		System.out.println(numberOfBoomerangs(points));
//		System.out.println(points.length);

	}

}

