package com.xjtuse.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s,String t){
		if(s.length()!=t.length()){
			return false;
		}
		int length=s.length();
		Set ss=new HashSet();
		Set st=new HashSet();
		for(int i=0;i!=length;i++){
			ss.add(s.charAt(i));
			st.add(t.charAt(i));
		}
		if(ss.size()!=st.size()){//if they do not have the same number of character such as "foo and bar",it can't be isomorpphic
			return false;
		}
		Map <Character,Character>map=new HashMap<Character,Character>();
		for(int i=0;i!=length;i++){
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), t.charAt(i));
			}else{
				if(!map.get(s.charAt(i)).equals(t.charAt(i))){//if the key appeared again,then we compared present value
					return false;//with the former value,judging whether they are the same,if not that means it can't be replaced
				}
			}
		}		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="egg";
		String s="too";
//		String t="paper";
//		String s="title";
//		String t="far";
//		String s="boo";
		boolean r=isIsomorphic(s,t);
		System.out.println(r);
	}

}
//for(char K:sa){
//System.out.print(K+"¡¡");
//}System.out.println();