package com.xjtuse.easy;

public class DeleteNodeInALinkedList {

	public static void deleteNode(ListNode head,ListNode node){
		node.val=node.next.val;
		node.next=node.next.next;
//		if(head==null){
//			return;
//		}
//		if(head.val==node.val){
//			head=head.next;
//			return;
//		}
//		ListNode pre=head,post=head.next;
//		while(post!=null){
//			if(post.val==node.val){
//				pre.next=post.next;
//				return;
//			}else{
//				pre=post;
//				post=post.next;
//			}
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(1);
		ListNode l3=new ListNode(2);
		ListNode l4=new ListNode(1);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		deleteNode(l1,l3);
	}
}
