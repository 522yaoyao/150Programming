package two;

public class Test {
	public static void main(String[] args){
		LinkList list=new LinkList();
		int[] a={1,2,3,4,5,6,7,8};
		list.initLinkList(a);
		System.out.println(list.length(list.first));
		}
}
