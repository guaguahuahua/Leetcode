package com.xjtuse.easy;

public class OddEvenLinkedList_1 {

	public static ListNode oddEvenList(ListNode head){
		
		if(head==null || head.next==null || head.next.next==null){
			return head;
		}
		ListNode odd=head,second=head.next,even=head.next;
		while(even!=null && even.next!=null){
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}
		odd.next=second;
//		while(head!=null){
//			System.out.print(head.val+" ");
//			head=head.next;
//		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(7);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(4);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(7);
		ListNode n6=new ListNode(8);
		ListNode n7=new ListNode(6);
//		ListNode n8=new ListNode(6);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
//		n7.next=n8;
		ListNode head=oddEvenList(n1);
		while(head!=null){
			System.out.print(head.val+"¡¡");
			head=head.next;
		}
	}

}
