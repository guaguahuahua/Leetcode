package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedSet_1 {
	
	List<Integer>list;
    /** Initialize your data structure here. */
    public RandomizedSet_1() {
    	list=new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
    	if(list.contains(val)){
    		return false;
    	}
    	list.add(val);
    	return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(list.contains(val)){
        	list.remove(val);
        	return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r=new Random();
        int index=r.nextInt(list.size());//get the random num as index  to return;
    	return list.get(index);
    }
    
    //testing area!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomizedSet r=new RandomizedSet();
		boolean res1=r.insert(1);
		System.out.println(res1);
		boolean res2=r.insert(2);
		System.out.println(res2);
		int res3=r.getRandom();
		System.out.println(res3);
		

	}

}
