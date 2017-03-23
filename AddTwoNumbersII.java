package com.xjtuse.easy;

public class AddTwoNumbersII {
	//�㷨˼�룺�Ƚ���������������ã����ý���֮���ڰ���I���㷨������ӣ�����֮���ٴ����ã��ǳ���ࣻ
	//�����ǣ������ú�����������ȥ���ÿ��ƣ���Ӻ���Ҳ���Է�������ȥ��
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		
		l1=reverse(l1);//���õ�����l1
		l2=reverse(l2);//���õ�����l2
		ListNode head=new ListNode(0),h=head;//�½��ڵ㣬������֮�ͷ��뵽��������
		int sum=0;
		while(l1!=null || l2!=null){//������������ÿ��Ԫ�ؽ������
			sum/=10;
			if(l1!=null){
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2!=null){
				sum+=l2.val;
				l2=l2.next;
			}
			ListNode node=new ListNode(sum%10);
			head.next=node;
			head=head.next;
		}
//		System.out.println(head.val+" ");
		if(sum/10==1){//����ٴ��ж��Ƿ����������Ƿ�Ӧ������µĽڵ㣬
			head.next=new ListNode(1);
		}
		h=reverse(h.next);//�����õ�����������ת
//		while(h!=null){
//			System.out.print(h.val+"��");
//			h=h.next;
//		}
//		
//		while(l1!=null){//test para
//			System.out.print(l1.val+"��");
//			l1=l1.next;
//		}
		
		return h;
	}
	public static ListNode reverse(ListNode head){
		
		ListNode then=head.next,post;
		head.next=null;
		while(then!=null){
			post=then.next;
			then.next=head;
			head=then;
			then=post;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(9);
		ListNode n2=new ListNode(7);
//		ListNode n3=new ListNode(4);
//		ListNode n4=new ListNode(3);
		ListNode l1=new ListNode(9);
//		ListNode l2=new ListNode(6);
//		ListNode l3=new ListNode(4);
		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		l1.next=l2;
//		l2.next=l3;
		ListNode head=addTwoNumbers(n1,l1);
		while(head!=null){
			System.out.print(head.val+"��");
			head=head.next;
		}
	}

}
