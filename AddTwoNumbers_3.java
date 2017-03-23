package com.xjtuse.easy;

public class AddTwoNumbers_3 {

	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode pre1=l1,pre2=l2;
		ListNode h1=l1;
		int sum=0;
		while(l1!=null && l2!=null){
			sum/=10;//�ж��Ƿ��н�λ
			sum=sum+l1.val+l2.val;//��������Ӧλ��ֱ�����
			l1.val=sum%10;
			pre1=l1;
			pre2=l2;
			l1=l1.next;
			l2=l2.next;			
		}
		//����Ҫ�ж�һ��l1��l2��һ��ָ���ˣ�Ȼ����ѭ���жϺ�������зǿս���ǲ���Ҫ���м�һ��������ֱ�ӷ���
		ListNode node=(l1==null)?l2:l1;
		pre1.next=node;
		//�������Ҫ�Ƿ�ֹһ���������ʱ����һ������Ľ�λ������� 1+99999���ּ�������
		while(node!=null){//��󻹻��漰����λ���⣬ ��Ҫ�����һλ�������˻������һ���µĽڵ�
			sum/=10;
			sum+=node.val;
			node.val=sum%10;
			pre1=pre1.next;
			node=node.next;
		}
		//������ж�һ���ǲ�����Ҫ����½ڵ�
		if(sum/10==1){
			ListNode tail=new ListNode(1);
			pre1.next=tail;
		}
		while(h1!=null){
			System.out.print(h1.val+" ");
			h1=h1.next;
		}
		return h1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(9);
//		ListNode l2=new ListNode(0);
//		ListNode l3=new ListNode(1);
//		ListNode l4=new ListNode(6);
//		ListNode l5=new ListNode(1);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(9);
		ListNode n3=new ListNode(9);
		ListNode n4=new ListNode(9);
//		ListNode n5=new ListNode(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
//		n4.next=n5;
		ListNode head=addTwoNumbers(l1,n1);
		
//		while(head!=null){//output para
//		System.out.print(head.val+" ");
//		head=head.next;
//	}
	}
}
