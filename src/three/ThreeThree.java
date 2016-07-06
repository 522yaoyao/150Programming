package three;

import java.util.ArrayList;

public class ThreeThree {
public static void main(String[] args){
	//传入构造函数的值为每个堆栈的最大容量
	SetOfStacks stacks=new SetOfStacks(5);
	int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	for(int i=0;i<a.length;i++){
		stacks.push(a[i]);
	}
	int value1=stacks.popAt(3);
	int value2=stacks.popAt(2);
	System.out.print(value1+"\t"+value2);
	
	

}
}

	
/*定义一个节点类，具有前驱和后驱*/	
class Node{
	public   Node above;
	public   Node below;
	public int data;
	public Node(int d){
		data=d;
	}
}
class Stack{
	private int capacity;
	private Node top,bottom;
	public  int size=0;
	public Stack(int c){
		capacity=c;
		}
	/**
	 * 判断堆栈是否满
	 * @return
	 */
	public boolean isFull(){
		return size==capacity;
	}
	/**
	 * 连接两个节点
	 * @param above
	 * @param below
	 */
	public void join(Node above,Node below){
		if(below!=null)
			below.above=above;
		if(above!=null)
			above.above =below;
	}
	/**
	 * 入栈
	 * @param v
	 * @return
	 */
	public boolean   push(int v){
		if(size>=capacity)
			//栈满就不能继续入栈了
			return false;
		size++;
		Node n=new Node(v);
		if(size==1)
			bottom=n;
		join(n,top);
		top=n;
		return true;
	}
	/**
	 * 出栈
	 * @return
	 */
	public int  pop(){
		/*在出栈的时候进行了判断，如果size=0;则移除最后一个栈*/
		//if(size==0)
			//throw new Exception("Try to pop an empty stack");
		Node t=top;
		top=top.below;
		t.below=null;
		if(top!=null){
		top.above=null;
		}
		size--;
	    return t.data;
	}
	/**
	 * 判断堆栈是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return size==0;
	}
	/**
	 * 移除当前栈低元素
	 * @return
	 */
	public int removeBottom(){
		Node b=bottom;
		int v=b.data;
		bottom=bottom.above;
		b.above=null;
		if(bottom!=null){
			bottom.below=null;
			}
		size--;
		return v;
	}
}
/**
 * 在现实生活中，盘子堆到一定高度后，我们会另外再堆一堆盘子。用数据结构模拟这种行为，SetOfStacks应该由多个栈组成，在前一个栈填满
 * 时新建一个栈，具有一般堆栈同样的pop()方法，还要具有，可以返回指定堆栈的栈顶元素popAt();
 * @author zx
 *
 */
class SetOfStacks{
	//Array,大小可变数组，线程不同步
	ArrayList<Stack> stacks=new ArrayList<Stack>();
	public int capacity;
	public SetOfStacks(int c){
		//设置capacity的初值，该初值为每个堆栈的最大容量
		capacity=c;
	}
	/**
	 * 得到当前的最后一个堆栈
	 * @return
	 */
	public Stack getLastStack(){
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
	}
	/**
	 * 入栈
	 * @param v
	 */
	public void push(int v){
		Stack last=getLastStack();
		if(last!=null&&!last.isFull())
			/*最后一个栈存在且没满*/
			last.push(v);
		else{
			/*新建立一个堆栈*/
			Stack stack=new  Stack(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	/**
	 * 出栈
	 * @return
	 */
	public int pop(){
		Stack last=getLastStack();
		int v=last.pop();
		if(last.size==0)
			//若当前栈以空，移除当前栈，所以不存在在再次出栈的时候，栈为空的情况
			stacks.remove(stacks.size()-1);
		return v;
		}
	/**
	 * 判断最后一个栈是否为空
	 * @return
	 */
	public boolean isEmpty(){
		Stack last=getLastStack();
		return last==null||last.isEmpty();
	}
	/**
	 * 将下一个堆栈底部的元素移到前一个堆栈的栈顶
	 * @param index
	 * @param removeTop
	 * @return
	 */
	public int leftShift(int index,boolean removeTop){
		Stack stack=stacks.get( index);
		int remove_item;
		if(removeTop)
			 remove_item=stack.pop();
			else{
				remove_item=stack.removeBottom();
			}
			if(stack.isEmpty())
				stacks.remove(index);
			else if(stacks.size()>index+1){
				int v=leftShift(index+1,false);
				stack.push(v);
			}
			return remove_item;
		
	}
	/**
	 * 选择特定的栈出栈
	 * @param index
	 * @return
	 */
	public int popAt(int index){
		return leftShift(index,true);
	}
}