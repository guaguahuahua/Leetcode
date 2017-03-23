package com.xjtuse.easy;

public class OddEvenLinkedList {

	public static ListNode oddEvenList(ListNode head){
		
		if(head==null || head.next==null || head.next.next==null){
			return head;
		}
		ListNode node1=new ListNode(0);
		ListNode node2=new ListNode(0);
		ListNode pre=node2,result=node1;
		int count=0;
		while(head!=null){
			count++;
			if(count>>1<<1!=count){
				node1.next=head;
				node1=node1.next;
			}else{
				node2.next=head;
				node2=node2.next;
			}
			head=head.next;
		}
		node2.next=null;
		node1.next=pre.next;
//		while(test!=null){//test para
//			System.out.print(test.val+" ");
//			test=test.next;
//		}
		
		return result.next;
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
		ListNode n8=new ListNode(6);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		ListNode head=oddEvenList(n1);
		while(head!=null){
			System.out.print(head.val+"¡¡");
			head=head.next;
		}
	}

}
