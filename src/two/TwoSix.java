package two;

public class TwoSix {
	public static void main(String[] args){
		LinkList l1=new LinkList();
		LinkList l2=new LinkList();
		int[] a={1,2,3};
		l1.initLinkList(a);
	    Node last1=l1.findLast(l1.first);
		int[] b={4,5,6,7,8,9,10};
		l2.initLinkList(b);
		Node last2=l2.findLast(l2.first);
		//System.out.println(last2.data);
		last1.next=l2.first.next;
		last2.next=last1;
		Node node=findBeginning(l1.first);
	   System.out.println(node.data);
		LinkList l3=new LinkList();
		int[] c={1,2,3,4};
		l3.initLinkList(c);
		Node node2=findBeginning(l3.first);
		System.out.println(node2);
	}
	/**
	 * �ж�һ�������Ƿ����л�����������л��������ػ�·�Ŀ�ʼ�ڵ�
	 * @param head
	 * @return
	 */
	public static Node findBeginning(Node head){
		Node fast=head;
		Node slow=head;
		/*���������&&����Ϊ���ûᵼ��ָ��ָ���ָ�룬����Ϊż�����ڵ�ʱ������ͷָ�룩�ᵼ��fast�Ѿ�ָ��β�ڵ��ˣ�
		 * ���Ƿ�������������ִ��fast=fast.next.next���¿�ָ���쳣������Ϊ�������ڵ�ʱ������ͷָ�룩���ᵼ����while����ж�ʱ
		 * fast.next1=null���¿�ָ���쳣����Ϊfast!=null�϶�Ϊfalse ����һ�����жϺ���������׳����쳣*/
	  while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				break;
		}
		/*�����������whileѭ����һ�ֲ����л�����һ�������ڵ���ײ*/
		if(fast==null||fast.next==null)
			//�������л�����
			return null;
		slow=head;
		while(fast!=slow){
			fast=fast.next;
			slow=slow.next;
		}
		return fast;
	}

}
