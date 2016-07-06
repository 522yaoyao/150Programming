package three;

import java.util.Stack;
import java.lang.Math;

public class ThreeTwo {
	public static void main(String[] args){
		StackWithMin stack=new StackWithMin();
		int[] a={5,6,0,7,3,7};
		for(int i=0;i<a.length;i++){
			stack.push(a[i]);
		}
		int minValue=stack.min();
		System.out.println(minValue);
		StackWithMin2 stack2=new StackWithMin2();
		for(int i=0;i<a.length;i++){
			stack2.push(a[i]);
		}
		int min=stack2.pop().min;
		System.out.println(min);
	}

}
/**
 * 请设计一个栈，不仅包含push(),pop()方法，还包括min()方法，返回栈中最小的元素，三个方法的时间复杂度都是O（1）；
 * @author zx
 *
 */
class StackWithMin extends Stack<Integer>{
	Stack<Integer> s2;
	public StackWithMin(){
		s2=new Stack<Integer>();
	}
	/**
	 * 入栈
	 * @param value
	 */
	public void push(int value){
		if(value<min()){
			s2.push(value);
		}
		super.push(value);
	}
	@Override
	public Integer pop(){
		int value=super.pop();
		if(value==min()){
			s2.pop();
		}
		return value;
	}
	/**
	 * 返回最小值
	 * @return
	 */
	public int min(){
		if(s2.isEmpty())
			return Integer.MAX_VALUE;
		else{
			return s2.peek();
		}
		
	}
	
}
class StackWithMin2 extends Stack<NodeWithMin>{
	/**
	 * 入栈
	 * @param value
	 */
	public void push(int value){
		int newMin=Math.min(value,min());
		super.push(new NodeWithMin(value,newMin));
		}
	@Override
	/**
	 * 出栈
	 */
	public NodeWithMin pop(){
	 return 	super.pop();
		}
	/**
	 * 返回当前栈顶的元素的min变量
	 * @return
	 */
	public int min(){
		if(this.isEmpty())
			return Integer.MAX_VALUE;
		else{
			return peek().min;
		}
			
	}
}
class NodeWithMin{
	int value;
	int min;
	public NodeWithMin(int v,int m){
		value=v;
		min=m;
	}
	
}