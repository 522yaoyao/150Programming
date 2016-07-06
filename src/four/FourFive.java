package four;

public class FourFive {
	public static void main(String[] args){
		int[] a={10,5,10};
		Tree  tree=new Tree();
		tree.creatTree(a);
		Node root=tree.nodeList.get(0);
		System.out.println(checkBST2(root));
		
	}
	/**
	 * 判断一棵树是否是二叉查找树（不含重复节点）
	 */
	public static int last_printed=Integer.MIN_VALUE;
	public static boolean checkBST2(Node n){
		if(n==null)
			return true;
		if(!checkBST(n.leftChild)) return false;
		if(n.data<=last_printed)
			return false;
		last_printed=n.data;
		if(!checkBST(n.rightChild)) return false;
		return true;
	}
/**
 * 判断一棵树是否为二叉查找树（无重复节点）；
 * @param n
 * @return
 */
	public static  boolean checkBST(Node n){
		return checkBST(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public static boolean checkBST(Node n,int min,int max){
		if(n==null)
			return true;
		if(n.data<min||n.data>=max)
			return false;
		if(!checkBST(n.leftChild,min,n.data)||!checkBST(n.rightChild,n.data,max))
			return false;
		return true;
	}
}
