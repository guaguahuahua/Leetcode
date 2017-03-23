package com.xjtuse.easy;

public class ReverseLinkedListII {
	//算法思想，一次遍历找到逆置的开始和结束节点的位置，
	//从开始节点到结束节点之间的全部逆置；连接起来
	public static ListNode reverseBetween(ListNode head,int m,int n){
		
		if(m==n){
			return head;
		}
		ListNode virtual=new ListNode(0);
		virtual.next=head;
		ListNode end=head,start=head,pre=virtual,post=null;
		ListNode p,q,r;
		ListNode temp=new ListNode(0);
		head=virtual;
		for(int i=0;head!=null;i++){
			if(i==m){//获得开始值
				start=head;
				pre=temp;//让pre指向逆置的前一个元素
			}
			if(i==n){
				end=head;
				break;//得到end值时候，结束寻找过程
			}
			temp=head;
			head=head.next;
		}
		post=end.next;//让post指向逆置序列的后一个元素
		end.next=null;
		System.out.print(pre.val+"\t");
		System.out.print(start.val+"\t");
		System.out.print(end.val+"\t");
		System.out.print(post.val+"\t");
		q=start;
		p=q.next;
		while(p!=null){
			r=p.next;
			p.next=q;
			q=p;
			p=r;
		}
//		end.next=null;
//		q=reverse(start,end);
		pre.next=q;//逆置的前一个元素指向新头结点
		start.next=post;//序列的最后一个节点指向原来的后一个元素
		return virtual.next;
	}
//	public static ListNode reverse(ListNode start,ListNode end){
//		ListNode p,q,r;//用来逆置范围内的所有节点
//		q=start;
//		p=q.next;
//		while(p!=null){
//			r=p.next;
//			p.next=q;
//			q=p;
//			p=r;
//		}
//		return q;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
//		ListNode n4=new ListNode(4);
//		ListNode n5=new ListNode(5);
//		ListNode n6=new ListNode(6);
//		ListNode n7=new ListNode(7);
		n1.next=n2;
		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
		ListNode head=reverseBetween(n1,1,2);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
