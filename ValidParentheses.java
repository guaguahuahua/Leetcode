package com.xjtuse.easy;

import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s){
		//使用java自带的栈功能来实现
		Stack <Character>stack=new Stack<Character>();
		for(int i=0;i!=s.length();i++){//依次的将每个字符放入栈中
			if(stack.empty()){//栈为空，直接压栈
				stack.push(s.charAt(i));
			}else if(stack.peek().equals('(') && s.charAt(i)==')'){//如果栈顶元素是和检查元素相等，栈顶元素出栈
				stack.pop();
//				stack.push(s.charAt(i));
			}else if(stack.peek().equals('[') && s.charAt(i)==']'){
				stack.pop();
			}else if(stack.peek().equals('{') && s.charAt(i)=='}'){
				stack.pop();
			}else{//如果当前的元素和栈顶元素不匹配，那么直接压栈
				stack.push(s.charAt(i));
			}
		}
		System.out.println(stack.empty()+" ");
		return stack.empty()?true:false;
//		return true;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="()[]{}";
//		String s="(]{}";
		String s="([)]";
		isValid(s);
	}

}
