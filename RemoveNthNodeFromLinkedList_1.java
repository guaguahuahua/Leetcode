package com.xjtuse.easy;

public class RemoveNthNodeFromLinkedList_1 {
//ʹ��reverse�����뷨��ԭ����û�п��ǵ���Ŀ��Ҫ����Ϊ���յķ��ؽ���ǰ���˳�����ģ�������֮��
//���е�Ԫ���Ѿ����ƻ����ˣ�ֻ������ʱ��Ϳռ�ɱ���
//���Դ��ַ���  fail 
	public static ListNode removeNthFromEnd(ListNode head,int n){
		
		if(head.next==null){// ����һ���ڵ�
			return null;
		}
		ListNode node=reverse(head);
		if(n==1){
			return node.next;
		}
		while(n>1){
			
		}
		return null;
	}
	public static ListNode reverse(ListNode head){
		ListNode q=head,p=q.next,r;
		q.next=null;
		while(p!=null){
			r=p.next;
			p.next=q;
			q=p;
			p=r;
		}
		while(q!=null){
			System.out.print(q.val+" ");
			q=q.next;
		}
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		removeNthFromEnd(n1,1);
//		while(r!=null){
//			System.out.print(r.val+" ");
//			r=r.next;
//		}
	}
}
