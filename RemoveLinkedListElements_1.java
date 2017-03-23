package com.xjtuse.easy;

public class RemoveLinkedListElements_1 {

	public static ListNode removeElements(ListNode head,int val){
		
		if(head==null){
			return head;
		}
		ListNode q=head,p=q.next; 
		while(p!=null){
			if(p.val==val){
				q.next=p.next;
				p=p.next;
			}else{
				q=p;
				p=p.next;
			}
		}
		if(head.val==val){//always omit the first element,so the pointer must change
			head=head.next;
		}
		while(head!=null){//output
			System.out.print(head.val+"¡¡");
			head=head.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(5);
//		ListNode n2=new ListNode(5);
//		ListNode n3=new ListNode(5);
//		ListNode n4=new ListNode(5);
//		ListNode n2=new ListNode(8);
//		ListNode n3=new ListNode(7);
//		ListNode n4=new ListNode(6);
//		ListNode n5=new ListNode(2);
//		ListNode n6=new ListNode(3);
//		ListNode n7=new ListNode(4);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
		removeElements(n1,5);
	}

}
