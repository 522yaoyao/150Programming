package four;

import java.util.ArrayList;
import java.util.LinkedList;

public class FourFour {
	public static void main(String[] args){
		Tree tree=new Tree();
		int[] a={1,2,3,4,5,6,7,8,9};
		tree.creatTree(a);
		Node root=tree.nodeList.get(0);
		ArrayList<LinkedList<Node>> list=createLevelLinkedList2(root);
	LinkedList<Node> link=	list.get(2);
	System.out.println(link.get(0).data);
	/*int i=0;
		while(link.get(i)!=null){
		
			System.out.println(link.get(i).data);
			i++;
		
		}*/

}
	
	public static void  createLevelLinkedList(Node root,ArrayList<LinkedList<Node>>  lists,int level){
		if(root==null)
			return;
		LinkedList<Node> list=null;
		if(lists.size()==level){
			/*lists中还没有此层链表*/
			list=new LinkedList<Node>();
			lists.add(list);
		}
		else{
			/*若lists中存在此层，获取此层*/
			list=lists.get(level);
		}
		//先序遍历
		list.add(root);//将节点加入此层
		createLevelLinkedList(root.leftChild,lists,level+1);
		createLevelLinkedList(root.rightChild,lists,level+1);
		
		 }
	public static ArrayList<LinkedList<Node>>  createLevelLinkedList(Node root){
		ArrayList<LinkedList<Node>> lists=new ArrayList<LinkedList<Node>>();
		   createLevelLinkedList(root,lists,0);
		   return lists;
	}
	public static ArrayList<LinkedList<Node>>  createLevelLinkedList2(Node root){
		ArrayList<LinkedList<Node>> result=new ArrayList<LinkedList<Node>>();
		LinkedList<Node> current=null;
		if(root!=null){
			//建立一个LinkedList<Node>对象current,对此对象进行操作；
			current=new LinkedList<Node>();
			current.add(root);
			}
		while(current.size()>0){
			/*当前current中存在节点，加入数组中*/
			result.add(current);
			LinkedList<Node> parents=current;
			 current=new LinkedList<Node>();
			 for(Node parent:parents){
				 if(parent.leftChild!=null)
					 current.add(parent.leftChild);
				 if(parent.rightChild!=null)
					 current.add(parent.rightChild);
				 
			 }
		}
			
		
		return result;
	}

}
