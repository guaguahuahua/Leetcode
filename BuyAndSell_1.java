package com.xjtuse.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BuyAndSell_1 {

	/**
	 * @param args
	 */
	public static int maxProfit(int []prices){
		int profit=0;
		int delta=0;
		if(prices.length==0){
			return profit;
		}
		int min=prices[0];
		for(int i=1;i<prices.length;i++){
			if(prices[i]<min){
				min=prices[i];
			}else{
				delta=prices[i]-min;
				profit=delta>profit?delta:profit;
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []prices={7,1,5,3,6,4};
//		int []prices={7,6,4,3,1};
		int []prices={};
		System.out.print(maxProfit(prices));
	}
}
