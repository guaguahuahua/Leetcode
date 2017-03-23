package com.xjtuse.easy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {
	Set <Integer>set;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set=new HashSet<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
    	if(set.contains(val)){
    		return false;
    	}
    	set.add(val);
    	return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)){
        	set.remove(val);
        	return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r=new Random();
        int index=r.nextInt(set.size());//get the random num as index  to return;
        Object[]t=new Object[set.size()];
        t=set.toArray();
    	return (Integer)t[index];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomizedSet obj = new RandomizedSet();
		boolean param_1 = obj.insert(1);
		boolean param_4 = obj.insert(2);
		System.out.println(param_1);
		System.out.println(param_4);
//		boolean param_2 = obj.remove(2);
//		System.out.println(param_2);
		int param_3 = obj.getRandom();
		System.out.println(param_3);
		
		
	}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
