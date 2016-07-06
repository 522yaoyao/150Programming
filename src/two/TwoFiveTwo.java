package two;

public class TwoFiveTwo {
	public static void main(String[] args){
		LinkList l1=new LinkList();
		LinkList l2=new LinkList();
		int[] a={1,2,3,4};
		int[] b={5,6,7};
		l1.initLinkList(a);
		//int l=l1.length1(l1.first.next);
		//System.out.println(l);
		l2.initLinkList(b);
		Node head=addLinkList(l1.first.next,l2.first.next);
		while(head!=null){
			System.out.print(head.data+"\t");
			head=head.next;
		}
		
	}
	/**
	 *  ���������������ʾ������,��ÿ���ڵ����һ����λ����Щ��λ�������ŵģ�Ҳ���Ǹ�λ���������β������д������������������ͣ�
	 * �����������ʽ���ؽ������λ��ȻΪ�������λ��
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static Node addLinkList(Node l1,Node l2){
		int len1=l1.length(l1);
		int len2=l1.length(l2);
		/*���϶̵�����ǰ�ڵ��������*/
		if(len1<len2)
			l1=padLinkList(l1,len2-len1);
		else
			l2=padLinkList(l2,len1-len2);
		/*�������������*/
		PartialSum sum=addLinkListHelper(l1,l2);
		/*����λΪ1��������׽ڵ��ټ�һ���ڵ�*/
		if(sum.carry==1){
			Node n=insertBefore(sum.sum,1);
			return n;
		}
		else
			return sum.sum;
			}
	/**
	 * ���������ĳ���
	 * @param l
	 * @return
	 */
 public static int length(Node l){
	 int i=0;
	 while(l!=null){
		 i++;
		 l=l.next;
	 }
	 return i;
 }
 /**
  * �϶̵������ͷ��ֵΪ��Ľڵ�
  * @param l
  * @param k
  * @return
  */
 public static Node padLinkList(Node l,int k){
	 Node head=l;
	 for(int i=0;i<k;i++){
		 Node node=new Node(0);
		 node.next=head;
		 head=node;
	 }
	 return head;
 }
 /**
  * ����������ӣ��õݹ�ķ���
  * @param l1
  * @param l2
  * @return
  */
 public static PartialSum addLinkListHelper(Node l1,Node l2){
	 if(l1==null&&l2==null){
		 PartialSum sum=new PartialSum();
		 return sum;
	 }
	  PartialSum sum=addLinkListHelper(l1.next,l2.next);
	 int  value=l1.data+l2.data+sum.carry;
	  Node result=insertBefore(sum.sum,value%10);
	  sum.sum=result;
	  sum.carry=value/10;
	  return sum;
 }
 /**
  * ���ڵ����������ײ�
  * @param list
  * @param data
  * @return
  */
 public static Node insertBefore(Node list,int data){
	 Node node=new Node(data);
	 if(list!=null){
		 node.next=list;
	 }
	 return node;
		 
 }
}
class PartialSum{
	Node sum=null;
	int carry=0;
}