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
	 * ɾ�����������е�ĳ���ڵ㣬������ֻ�ܷ��ʸýڵ�
	 * @param n
	 * @return  boolean
	 */
	public static boolean deleteNode(Node n){
		//�ڵ�Ϊ�գ����߽ڵ�Ϊβ�ڵ㣬���Ϊ��
		if(n==null||n.next==null)
			return false;
		Node next=n.next;
		n.data=next.data;
		n.next=next.next;
		return true;
	}
	
}
