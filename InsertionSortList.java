package com.xjtuse.easy;

public class InsertionSortList {

	public static ListNode insertionSortList(ListNode head){
		
		if(head==null || head.next==null){
			return head;
		}
		ListNode virtual=new ListNode(0);
		virtual.next=head;
		ListNode pre=virtual,t=head.next,temp;
		head.next=null;
		boolean flag;
		while(t!=null){
			flag=false;
			temp=t;
			t=t.next;
			temp.next=null;//剥离一个单独的节点出来
			while(head!=null){//将剥离的节点插入到前面的有序列中
				if(temp.val<=head.val){
					temp.next=head;
					pre.next=temp;
					flag=true;
					break;
				}
				pre=head;
				head=head.next;
			}
			if(!flag){
				temp.next=pre.next;
				pre.next=temp;
			}
			pre=virtual;
			head=virtual.next;
		}
		return virtual.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(7);
		ListNode n2=new ListNode(2);
//		ListNode n3=new ListNode(4);
//		ListNode n4=new ListNode(4);
//		ListNode n5=new ListNode(7);
//		ListNode n6=new ListNode(8);
//		ListNode n7=new ListNode(6);
//		ListNode n8=new ListNode(6);
		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
//		n7.next=n8;
		ListNode head=insertionSortList(n1);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
