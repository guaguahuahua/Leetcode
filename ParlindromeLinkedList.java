package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class ParlindromeLinkedList {

	public static boolean isPalindrome(ListNode head){
		
		if(head==null){
			return true;
		}
		List list=new ArrayList();
		while(head!=null){
			list.add(head.val);
			head=head.next;
		}
		int right=list.size()-1,left=0;
		while(left<=right){
			if(!list.get(left).equals(list.get(right))){
				System.out.println(false);
				return false;
			}
			left++;
			right--;
		}
		System.out.println(true);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(-129);
		ListNode l2=new ListNode(-129);
//		ListNode l3=new ListNode(2);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(2);
//		ListNode l6=new ListNode(1);
//		ListNode l7=new ListNode(0);
		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
//		l5.next=l6;
//		l6.next=l7;
		isPalindrome(l1);
	}

}
