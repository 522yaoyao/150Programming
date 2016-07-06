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
 * �����һ��ջ����������push(),pop()������������min()����������ջ����С��Ԫ�أ�����������ʱ�临�Ӷȶ���O��1����
 * @author zx
 *
 */
class StackWithMin extends Stack<Integer>{
	Stack<Integer> s2;
	public StackWithMin(){
		s2=new Stack<Integer>();
	}
	/**
	 * ��ջ
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
	 * ������Сֵ
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
	 * ��ջ
	 * @param value
	 */
	public void push(int value){
		int newMin=Math.min(value,min());
		super.push(new NodeWithMin(value,newMin));
		}
	@Override
	/**
	 * ��ջ
	 */
	public NodeWithMin pop(){
	 return 	super.pop();
		}
	/**
	 * ���ص�ǰջ����Ԫ�ص�min����
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