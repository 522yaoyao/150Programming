package three;

import java.util.Stack;

public class ThreeSix {
	public static void  main(String[] args){
		int[] a={1,9,2,8,3,7,4,6,5};
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<a.length;i++){
			stack.push(a[i]);
		}
		Stack<Integer> r=sort(stack);
		while(!r.isEmpty()){
			System.out.print(r.pop()+"\t");
		}
		
	}
	/**
	 * 编写程序，使堆栈升序排序(最大的元素在栈顶)，最多只能使用一个额外的堆栈存放临时数据，但是不允许将数据复制到其他的数据结构中
	 * （如数组）。该栈支持push(),pop(),isEmpty(),peek()操作。
	 * @param s
	 * @return
	 */
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> r=new Stack<Integer>();
		while(!s.isEmpty()){
			int tmp=s.pop();
			while(!r.isEmpty()&&r.peek()>tmp){
				s.push(r.pop());
			}
			r.push(tmp);
			}
		return r;
	}

}
