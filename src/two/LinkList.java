package two;

public class LinkList {
	//����ͷ��㣬���ڴ�ͷ������
	 Node first=new Node();
	 /**
	  * ��ӽڵ�
	  * @param d
	  */
	 void append(int d){
		 Node end=new Node(d);
		 Node n=first;
		 //ʹn�ƶ�����������һ���ڵ�
		 while(n.next!=null){
			 n=n.next;
		 }
		 n.next=end;
	 }
 /**
  * �������
  */
 public void printlink(){
	 Node ptr=null;
	 //��������Ϊ�գ�ֻ��ͷ�ڵ㣬�������أ�
	 if(first.next==null){
			return;
		}
ptr=first.next;
	 while(ptr!=null){
		 System.out.print(ptr.getData()+"\t");
		 ptr=ptr.next;
	 }
 }
 /**
  * ��ʼ��������һ�������е�����һ�δ��������У���
  * @param n
  */
 public  void initLinkList(int[] n){
	 for(int i=0;i<n.length;i++){
		 append(n[i]);
	 }
 }
/**
 *  ��ȡ����ĵ�n���ڵ㣨����ͷ�ڵ㣩
 * @param k
 * @return  Node
 */
 public  Node getNode(int n){
	 Node p1=first;
	 for(int i=0;i<n;i++)
		 p1=p1.next;
	 return p1;
 }
 /**
  * �ҵ������β��
  * @param head
  * @return
  */
 public Node findLast(Node head){
	 Node last=head;
	 while(last.next!=null){
		 last=last.next ;
	 }
	 return last;
 }
 public int length(Node node){
	 int i=0;
	 while(node!=null){
		 i++;
		 node=node.next;
	 }
	 return i;
 }
 /**
  * ����ĳ���(����ͷ��㣬ֻ��ͷ����������0)
  * @param node
  * @return
  */
 public int length(){
	 if(first.next==null)
		 return 0;
	 int l=0;
	  Node  node=first.next;
	 while(node!=null){
		 l++;
		 node=node.next;
	 }
	return l; 
	}
}
