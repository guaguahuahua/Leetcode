package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedList {

	public static ListNode deleteDuplicates(ListNode head){
		
		ListNode p,q;
		if(head==null){
			return null;
		}
		if(head.next==null){
			return head;
		}
		q=head;
		p=q.next;
		while(p!=null){
			if(p.val==q.val){
				p=p.next;
				q.next=p;
			}else{
				q=p;
				p=p.next;
			}
		}
		
		while(head!=null){//output elements
			System.out.print(head.val+" ");
			head=head.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode();
//		ListNode l2=new ListNode(1);
//		ListNode l3=new ListNode(2);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(3);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
		ListNode head=deleteDuplicates(l1);
		while(head!=null){//output elements
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
