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
	 * ���������������ʾ��������ÿ���ڵ����һ����λ����Щ��λ�Ƿ����ŵģ�Ҳ���Ǹ�λ�����������λ����д������������������ͣ�
	 * �����������ʽ���ؽ����
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
 
