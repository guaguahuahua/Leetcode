package com.xjtuse.easy;

public class SwapNodesInPairs_1 {

	public static ListNode swapPairs(ListNode head){
		
		ListNode virtual=new ListNode(0);
		ListNode slow=virtual,fast=head;
		while(fast!=null && fast.next!=null){
			slow.next=fast.next;
			slow=fast;
			fast=fast.next.next;
			slow.next.next=slow;//当时赋值的时候一直没有发现等式是反着的，
		}
		slow.next=fast;
		return virtual.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		ListNode head=swapPairs(n1);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
