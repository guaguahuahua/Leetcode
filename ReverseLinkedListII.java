package com.xjtuse.easy;

public class ReverseLinkedListII {
	//�㷨˼�룬һ�α����ҵ����õĿ�ʼ�ͽ����ڵ��λ�ã�
	//�ӿ�ʼ�ڵ㵽�����ڵ�֮���ȫ�����ã���������
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
			if(i==m){//��ÿ�ʼֵ
				start=head;
				pre=temp;//��preָ�����õ�ǰһ��Ԫ��
			}
			if(i==n){
				end=head;
				break;//�õ�endֵʱ�򣬽���Ѱ�ҹ���
			}
			temp=head;
			head=head.next;
		}
		post=end.next;//��postָ���������еĺ�һ��Ԫ��
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
		pre.next=q;//���õ�ǰһ��Ԫ��ָ����ͷ���
		start.next=post;//���е����һ���ڵ�ָ��ԭ���ĺ�һ��Ԫ��
		return virtual.next;
	}
//	public static ListNode reverse(ListNode start,ListNode end){
//		ListNode p,q,r;//�������÷�Χ�ڵ����нڵ�
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
