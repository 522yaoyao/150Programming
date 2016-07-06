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
	 * 判定一个链表是否是有环链表，如果是有环链表，返回环路的开始节点
	 * @param head
	 * @return
	 */
	public static Node findBeginning(Node head){
		Node fast=head;
		Node slow=head;
		/*这里必须用&&，因为不用会导致指针指向空指针，链表为偶数个节点时（不含头指针）会导致fast已经指向尾节点了，
		 * 但是符合条件，继续执行fast=fast.next.next导致空指针异常，链表为奇数个节点时（不含头指针），会导致在while语句判断时
		 * fast.next1=null导致空指针异常，因为fast!=null肯定为false 所以一定会判断后面的语句就抛出了异常*/
	  while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				break;
		}
		/*两种情况跳出while循环，一种不是有环链表，一种两个节点碰撞*/
		if(fast==null||fast.next==null)
			//链表不是有环链表
			return null;
		slow=head;
		while(fast!=slow){
			fast=fast.next;
			slow=slow.next;
		}
		return fast;
	}

}
