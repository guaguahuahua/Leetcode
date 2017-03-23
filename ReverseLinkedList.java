package com.xjtuse.easy;

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head){
		
//		while(head!=null){
//			System.out.print(head.val+"¡¡");
//			head=head.next;
//		}System.out.println();
		if(head==null || head.next==null){//none or only one element
			return head;
		}		
		ListNode q=head,p=q.next;
		head.next=null;//the first one change to the last
		while(p!=null){
			head=p.next;
			p.next=q;
			q=p;
			p=head;
		}
		while(q!=null){//output all elements
			System.out.print(q.val+"¡¡");
			q=q.next;
		}
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(8);
//		ListNode n3=new ListNode(7);
//		ListNode n4=new ListNode(6);
//		ListNode n5=new ListNode(2);
//		ListNode n6=new ListNode(3);
//		ListNode n7=new ListNode(4);
		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
		reverseList(n1);
	}

}
