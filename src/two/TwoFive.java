package two;

public class TwoFive {
	public static void main(String[] args){
		LinkList l1=new LinkList();
		LinkList l2=new LinkList();
		int[] a={1,2,3,4,1};
		int[] b={1,2,3,4};
		l1.initLinkList(a);
		l2.initLinkList(b);
		Node node=addLinkList(l1.first.next,l2.first.next,0);
		while(node!=null){
			System.out.print(node.data+"\t");
			node=node.next;
		}
}
	
		
	
	/**
	 * 给定两个用链表表示的整数，每个节点包含一个数位，这些数位是反向存放的，也就是个位排在链表的首位。编写函数对这两个整数求和，
	 * 并用链表的形式返回结果。
	 * @param l1
	 * @param l2
	 * @param carry
	 * @return
	 */
	public static Node addLinkList(Node l1,Node l2,int carry){
		if(l1==null&&l2==null&&carry==0)
			return  null;
		Node result=new Node();
		int value=carry;
		if(l1!=null)
			value+=l1.data;
		if(l2!=null)
			value+=l2.data;
		result.data=value%10;
		Node  more=addLinkList(l1==null?null:l1.next,l2==null?null:l2.next,value>10?1:0);
		//result.next=more;
		result.setNext(more);
		return result;
	}
	


}
 
