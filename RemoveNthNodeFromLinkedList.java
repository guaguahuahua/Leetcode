package com.xjtuse.easy;

public class RemoveNthNodeFromLinkedList {

	public static ListNode removeNthFromEnd(ListNode head,int n){
		ListNode result=head,second=head;
		int count=0;
		while(head!=null){//ͳ��������
			count++;
			head=head.next;
		}
//		System.out.println(count);
		count=count-n;
		if(count==0){//���˵��Ҫɾ�����ǵ�һ���ڵ�
			result=result.next;
			return result;
		}
		while(count>1){//�ƶ�ָ�뵽Ҫɾ��λ�õ�ǰһ���ط�
			count--;
			second=second.next;
		}
		second.next=second.next.next;//ɾ����n��λ�õĽڵ�
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
//		ListNode n2=new ListNode(2);
//		ListNode n3=new ListNode(3);
//		ListNode n4=new ListNode(4);
//		ListNode n5=new ListNode(5);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
		ListNode r=removeNthFromEnd(n1,1);
		while(r!=null){
			System.out.print(r.val+" ");
			r=r.next;
		}
	}

}
