package com.xjtuse.easy;

public class IntersectionOfTwoLinkedLists {
	public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
		
		return null;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(0);
		ListNode l2=new ListNode(1);
		ListNode l3=new ListNode(2);
		ListNode l4=new ListNode(3);
		ListNode l5=new ListNode(4);
		ListNode l6=new ListNode(1);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(8);
		ListNode n3=new ListNode(7);
		ListNode n4=new ListNode(6);
		ListNode n5=new ListNode(2);
		ListNode n6=new ListNode(3);
		ListNode n7=new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		getIntersectionNode(l1,n1);
	}

}
