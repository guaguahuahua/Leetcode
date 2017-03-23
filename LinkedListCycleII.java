package com.xjtuse.easy;

public class LinkedListCycleII {
	//这是从社区看到的算法，算法的解释可以通过数学来表达，非常有说服力
	//实现分为两个步骤，（如果有循环）1.找到快慢指针的汇合点；2.分别从头、从汇合点开始一个指针，他们交汇地为循环开始点
	public static ListNode detectCycle(ListNode head){
		
		ListNode fast=head,slow=head;
		if(head.next==null || head==null){
			return null;
		}
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast){
				break;
			}
		}
		if(slow==fast){
			slow=head;
			while(slow!=fast){
				fast=fast.next;
				slow=slow.next;
			}
			return fast;
		}else{
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(0);
//		ListNode l2=new ListNode(1);
//		ListNode l3=new ListNode(2);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(4);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
//		l5.next=l3;
		ListNode result=detectCycle(l1);
		System.out.print(result+" ");
	}

}
