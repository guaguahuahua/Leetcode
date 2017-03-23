package com.xjtuse.easy;

public class LinkedListCycle {
	//two pointers and the quicker one chasing the slower one;
	public static boolean hasCycle(ListNode head){
		
//		if(head==null){
//			return false;
//		}
//		if(head.next==null){
//			return false;
//		}
		ListNode q=head,p=q.next;
		while(p!=null && p.next!=null && q!=null){
			p=p.next;
			p=p.next;
			q=q.next;		
		}
		if(p!=null && q!=null && q==p){
			System.out.println(true);
			return true;
		}else{
			System.out.println(false);
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(0);
//		ListNode l2=new ListNode(1);
//		ListNode l3=new ListNode(2);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(4);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
//		l5.next=l4;
		hasCycle(l1);
	}

}
