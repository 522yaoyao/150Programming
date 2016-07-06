package two;

public class TwoThree {
	public static void main (String[] args){
		LinkList link=new LinkList();
		int[] a={1,2,3,4,5};
		link.initLinkList(a);
		//System.out.println(link.getNode(2).data);
	boolean b=deleteNode(link.getNode(4));
	System.out.println(b);
		link.printlink();
	}
	/**
	 * 删除单向链表中的某个节点，假设你只能访问该节点
	 * @param n
	 * @return  boolean
	 */
	public static boolean deleteNode(Node n){
		//节点为空，或者节点为尾节点，标记为假
		if(n==null||n.next==null)
			return false;
		Node next=n.next;
		n.data=next.data;
		n.next=next.next;
		return true;
	}
	
}
