package four;

public class FourSixTwo {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		TreeTwo tree=new TreeTwo();
		tree.createtree(a);
		//NodeTwo node=tree.nodeList.get(0);
		//System.out.println(node.parent);
		System.out.println(inorderSucc(tree.nodeList.get(5)).data);
		System.out.println(inorderSucc(tree.nodeList.get(6)));
	}
	public static NodeTwo leftMostNodeTwo(NodeTwo node){
		if(node==null)
			return null;
		else{
			while(node.leftChild!=null){
				node=node.leftChild;
			}
			return node;
		}
		}
	/**
	 * 返回一棵树中任意节点的中序后继，假定每个节点都有指向父节点的指针；
	 * @param node
	 * @return
	 */
	public static NodeTwo inorderSucc(NodeTwo node){
		if(node==null)
			return null;
		if(node.rightChild!=null){
			return leftMostNodeTwo(node.rightChild);
			}
		else{
			NodeTwo x=node.parent;
			while(x!=null&&x.leftChild!=node){
				node=x;
				x=x.parent;
			}
			return x;
		}
	}
	}


