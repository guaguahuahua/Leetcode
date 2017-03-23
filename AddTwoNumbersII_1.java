package com.xjtuse.easy;

import java.util.Stack;

public class AddTwoNumbersII_1 {
	//首先题目不允许进行逆置元数据，所以应该做的是，使用栈，并且新建链表
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		
		Stack s1=new Stack(),s2=new Stack();
		while(l1!=null || l2!=null){//将两个单链表分别的压栈
			if(l1!=null){
				s1.push(l1.val);
				l1=l1.next;
			}
			if(l2!=null){
				s2.push(l2.val);
				l2=l2.next;
			}
		}
		ListNode head=new ListNode(0),h=head;
		int sum=0;
		while(!s1.empty() || !s2.empty()){
			sum/=10;
			if(!s1.empty()){
				sum+=(Integer)s1.pop();
			}
			if(!s2.empty()){
				sum+=(Integer)s2.pop();
			}
			ListNode node=new ListNode(sum%10);
			head.next=node;
			head=head.next;
		}
		if(sum/10==1){//如果发生了溢出
			head.next=new ListNode(1);
		}
//		while(!s1.empty()){//test para
//			System.out.print(s1.pop()+" ");
//		}
//		while(h!=null){
//			System.out.print(h.val+"　");
//			h=h.next;
//		}
		return reverse(h.next);
	}
	public static ListNode reverse(ListNode head){
		
		ListNode then=head.next,post;
		head.next=null;
		while(then!=null){
			post=then.next;
			then.next=head;
			head=then;
			then=post;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(9);
		ListNode n2=new ListNode(7);
		ListNode n3=new ListNode(4);
		ListNode n4=new ListNode(3);
		ListNode l1=new ListNode(9);
		ListNode l2=new ListNode(6);
		ListNode l3=new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		l1.next=l2;
		l2.next=l3;
		ListNode head=addTwoNumbers(n1,l1);
		while(head!=null){
			System.out.print(head.val+"　");
			head=head.next;
		}
	}
}
