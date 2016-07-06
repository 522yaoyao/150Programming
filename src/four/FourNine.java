package four;

public class FourNine {
	public  static void main(String[] args){
		Tree tree=new Tree();
		int[] a={1,2,3,3,5,0,10,9,-2,1};
		tree.creatTree(a);
		Node root=tree.nodeList.get(0);
		findSum(3,root);
		
	}
	public static void findSum(int sum,Node node){
		int depth=depth(node);
		int[] d=new int[depth];
		findSum(node,d,0,sum);
	}
	/**
	 * 计算当前节点的深度
	 * @param node
	 * @return
	 */
	public static int depth(Node node){
		if(node==null)
			return 0;
		return 1+Math.max(depth(node.leftChild), depth(node.rightChild));
	}
	public static void findSum(Node node,int[] d,int level,int sum){
		if(node==null)
			return ;
		d[level]=node.data;
		int t=0;
		for(int i=level;i>=0;i--){
			t+=d[i];
			if(t==sum)
				print(d,i,level);
		}
		findSum(node.leftChild,d,level+1,sum);
		findSum(node.rightChild,d,level+1,sum);
		/*从路径中移除当前节点，这是个好习惯*/
		d[level]=Integer.MIN_VALUE;
		
	}
	/**
	 * 输出路径
	 * @param d
	 * @param start
	 * @param end
	 */
	public static void print(int[] d,int start,int end){
		for(int i=start;i<=end;i++)
			System.out.print(d[i]+"\t");
		System.out.println();
	}

	}
