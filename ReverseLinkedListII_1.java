package com.xjtuse.easy;

public class ReverseLinkedListII_1 {
	//ʹ��������һ���㷨����Ҫ���Ż����ڣ�ֻҪ�ҵ�start�ڵ�����ˣ�Ȼ��Ӷ���������
	//ֱ��β�ڵ�
	public static ListNode reverseBetween(ListNode head,int m,int n){
		
		if(m==n){
			return head;
		}
		ListNode virtual=new ListNode(0);
		virtual.next=head;
		ListNode t=virtual,pre,start,end,then1 = null,then2;
		int i;
		for(i=1;i<m;i++){//Ѱ��start�ڵ�
			t=t.next;
		}
		pre=t;//������¼�������е�ǰһ���ڵ�λ��
		start=pre.next;
		
		System.out.print(start.val+"\t");
		then1=start.next;
		while(i<n){//�ӿ�ʼ�ڵ����ε�һ��һ�Ե����ýڵ�
			i++;
			then2=then1.next;
			then1.next=start;
			start=then1;
			then1=then2;

		}
		t.next.next=then1;
		pre.next=start;//��Ҫ�Ĵ���Ӧ��������������Ͼ�֮��������
		return virtual.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		ListNode n7=new ListNode(7);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		ListNode head=reverseBetween(n1,1,2);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
