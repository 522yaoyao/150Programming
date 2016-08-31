package two;
//定义节点类
public class Node {
	Node next=null;
	int data;
	public Node(){
		
	}
	public Node(int d){
		data=d;
	}
	public int getData(){
		return data;
	}
	public void setNext(Node node){
		next=node;
	}
    public int length(Node node){
    	 int i=0;
    	 while(node!=null){
    		 i++;
    		 node=node.next;
    	 }
    	 return i;
     }
}
