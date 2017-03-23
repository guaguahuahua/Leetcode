package com.xjtuse.easy;

public class PartitionList_1 {
	//leetcode社区的算法，首先得承认，理解得很到位，才想出这种方式
	//维护两个队列，第一个存放的是小于x的节点，第二个存放的是剩余节点，最后将第一个
	//队列和第二个队列连接在一起就完成了排序的过程。
	public static ListNode partition(ListNode head, int x){
		ListNode virtual1=new ListNode(0);
		ListNode virtual2=new ListNode(0);
		ListNode pre1=virtual1,pre2=virtual2;
		
		while(head!=null){
			if(head.val<x){
				pre1.next=head;
				pre1=head;
			}else{
				pre2.next=head;
				pre2=head;
			}
			head=head.next;
		}
		pre1.next=virtual2.next;
		pre2.next=null;
//		while(virtual1!=null){
//			System.out.print(virtual1.val+" ");
//			virtual1=virtual1.next;
//		}
		return virtual1.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(4);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(2);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(2);
//		ListNode n7=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
//		n6.next=n7;
		ListNode head=partition(n1,3);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
