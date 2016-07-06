package four;

public class FourOne {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		Tree tree=new Tree();
		tree.creatTree(a);
		Node root=tree.nodeList.get(0);
		System.out.println(isBalanced(root));
		/*建立一棵不平衡的树*/
		Tree tree2=new Tree();
		tree2.creatTree(a);
		Node root2=tree2.nodeList.get(0);
		tree2.nodeList.get(7).leftChild=new Node(10);
		System.out.println(isBalanced(root2));
		
		
	/*	System.out.println("先序遍历：");
		tree.proOrderTraverse(root);
		System.out.println();
		System.out.println("中序遍历：");
		tree.inOrderTraverse(root);
		System.out.println();
		System.out.println("后序遍历：");
		tree.postOrderTraverse(root);*/
		
		
	}
	/**
	 * 获取该节点的高度
	 * @param root
	 * @return
	 */
	public  static int checkHeight(Node root){
		if(root==null)
			return 0;
		int leftHeight=checkHeight(root.leftChild);
		if(leftHeight==-1)
			return -1;
		int rightHeight=checkHeight(root.rightChild);
		if(rightHeight==-1)
			return -1;
		int heightDiff=leftHeight-rightHeight;
		if(Math.abs(heightDiff)>1)
			return -1;
		else
			return Math.max(leftHeight, rightHeight)+1;
	}
	/**
	 * 判断以此节点为根的树是否平衡，平衡的定义为任意一个节点的左右两颗子树的高度差不超过一；
	 * @param root
	 * @return
	 */
	public static boolean isBalanced(Node root){
		int height=checkHeight(root);
		if(height==-1)
			return false;
		else
			return true;
	}
	

}
