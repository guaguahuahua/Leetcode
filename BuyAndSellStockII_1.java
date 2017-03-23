package com.xjtuse.easy;

public class BuyAndSellStockII_1 {
	
	public static int maxProfit(int []prices){
		
		int profit=0;
		int length=prices.length;
		if(length==0){
			return profit;
		}
		for(int i=0;i!=length-1;i++){
			if(prices[i+1]>prices[i]){
				profit+=prices[i+1]-prices[i];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []prices={7,1,5,3,6,4};
//		int []prices={7,6,4,3,2,1};
//		int []prices={};
		int []prices={5,1,2,4,3,6};
		int p=maxProfit(prices);
		System.out.println(p);
	}

}
