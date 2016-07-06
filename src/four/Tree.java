package four;

import java.util.ArrayList;

public class Tree {
	ArrayList<Node> nodeList;
	/**
	 * 建树
	 * @param array
	 */
	public void creatTree(int[] array){
		nodeList=new ArrayList<Node>();
		//将节点存入列表中
		for(int i=0;i<array.length;i++){
		nodeList.add(new Node(array[i]));
		//System.out.println(nodeList.get(i).data);
		}
		for(int i=0;i<array.length/2-1;i++){
			nodeList.get(i).leftChild=nodeList.get(i*2+1);
			nodeList.get(i).rightChild=nodeList.get(i*2+2);
		}
		int lastParentNode=array.length/2-1;
		nodeList.get(lastParentNode).leftChild=nodeList.get(lastParentNode*2+1);
		if(array.length%2==1)
			nodeList.get(lastParentNode).rightChild=nodeList.get(lastParentNode*2+2);
	}
	/**
	 * 先序遍历
	 * @param root
	 */
	public void proOrderTraverse(Node root){
		if(root==null)
			return;
		System.out.print(root.data+"\t");
		proOrderTraverse(root.leftChild);
		proOrderTraverse(root.rightChild);
	}
	/**
	 * 中序遍历
	 * @param root
	 */
	public void inOrderTraverse(Node root){
		if(root==null)
			return;
		inOrderTraverse(root.leftChild);
		System.out.print(root.data+"\t" );
		inOrderTraverse(root.rightChild);
	}
	/**
	 * 后序遍历
	 * @param root
	 */
	public void postOrderTraverse(Node root){
		if(root==null)
			return;
		postOrderTraverse(root.leftChild);
		postOrderTraverse(root.rightChild);
		System.out.print(root.data+"\t");
	}
/*	public static int i=0;
	public void proOrderTraverse2(Node root, int[] a){
		if(root==null){
			a[i]=0;
			i++;
			System.out.println(0);
		}
		else{
			a[i]=root.data;
			i++;
			System.out.println(root.data);
		}
		if(root.leftChild==null&&root.rightChild==null){
			return;}
		else{
			proOrderTraverse2(root.leftChild,a);
			proOrderTraverse2(root.rightChild,a);
		}
		*/
			
	}


