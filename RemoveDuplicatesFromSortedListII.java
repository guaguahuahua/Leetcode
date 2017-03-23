package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedListII {
	//思想：p,q,pre以及count将所有的重复节点一次性找齐了，直接删除
	public static ListNode deleteDuplicates(ListNode head){
		
		if(head==null || head.next==null){//链表为空或者仅有一个节点情形
			return head;
		}
		ListNode virtual=new ListNode(0);//主要是为了解决头节点是重复节点的情形
		virtual.next=head;
		ListNode pre=virtual,q=head,p=q.next;
		
		while(p!=null && q!=null){//至少有两个节点才会有重复可
			if(p.val!=q.val){//如果相邻两个节点的值不相等
				pre=q;
				q=p;
				p=p.next;//从左至右依次向后移动一位指针
			}else{//如果两个相邻节点的值相等
				while(p!=null && p.val==q.val){
					p=p.next;
				}
				pre.next=p;//删除中间的重复节点
				if(p!=null){//防止重复节点刚好在结尾
					q=p;
					p=p.next;
				}
			}
		}
		return virtual.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(3);
		ListNode n5=new ListNode(4);
		ListNode n6=new ListNode(4);
		ListNode n7=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		ListNode head=deleteDuplicates(n1);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
