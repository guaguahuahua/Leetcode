package com.xjtuse.easy;

public class BuyAndSellStockII {
	public static int maxProfit(int []prices){
		int length=prices.length;
		int profit=0;
		if(length==0){
			return profit;
		}
		int min=prices[0];
		
		for(int i=0;i!=length;i++){
			if(prices[i]<min){//if price[i]<min replace the min with it
				min=prices[i];
			}
			if(prices[i]>min){//if price[i]>min then sell stock
				profit=profit+prices[i]-min;
				min=prices[i];//renew the min value 
//				i--;//prevent index add two times
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
