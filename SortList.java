package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortList {
	public static ListNode sortList(ListNode head){
		List <Integer>list=new ArrayList<Integer>();
		ListNode p=head,q=head;
		while(head!=null){
			list.add(head.val);
			head=head.next;
		}
		Object[]array=new Object[list.size()];
		array=list.toArray();
		Arrays.sort(array);

		for(int i=0;p!=null;i++){
			p.val=(Integer)array[i];
			p=p.next;
		}
		while(q!=null){
			System.out.print(q.val+" ");
			q=q.next;
		}
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(7);
//		ListNode n2=new ListNode(2);
//		ListNode n3=new ListNode(4);
//		ListNode n4=new ListNode(4);
//		ListNode n5=new ListNode(7);
//		ListNode n6=new ListNode(8);
//		ListNode n7=new ListNode(6);
//		ListNode n8=new ListNode(6);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
//		n7.next=n8;
//		
		ListNode head=sortList(n1);
		while(head!=null){
			System.out.print(head.val+"¡¡");
			head=head.next;
		}
	}

}
