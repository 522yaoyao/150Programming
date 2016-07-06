package three;

import java.util.ArrayList;

public class ThreeThree {
public static void main(String[] args){
	//���빹�캯����ֵΪÿ����ջ���������
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

	
/*����һ���ڵ��࣬����ǰ���ͺ���*/	
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
	 * �ж϶�ջ�Ƿ���
	 * @return
	 */
	public boolean isFull(){
		return size==capacity;
	}
	/**
	 * ���������ڵ�
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
	 * ��ջ
	 * @param v
	 * @return
	 */
	public boolean   push(int v){
		if(size>=capacity)
			//ջ���Ͳ��ܼ�����ջ��
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
	 * ��ջ
	 * @return
	 */
	public int  pop(){
		/*�ڳ�ջ��ʱ��������жϣ����size=0;���Ƴ����һ��ջ*/
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
	 * �ж϶�ջ�Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty(){
		return size==0;
	}
	/**
	 * �Ƴ���ǰջ��Ԫ��
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
 * ����ʵ�����У����Ӷѵ�һ���߶Ⱥ����ǻ������ٶ�һ�����ӡ������ݽṹģ��������Ϊ��SetOfStacksӦ���ɶ��ջ��ɣ���ǰһ��ջ����
 * ʱ�½�һ��ջ������һ���ջͬ����pop()��������Ҫ���У����Է���ָ����ջ��ջ��Ԫ��popAt();
 * @author zx
 *
 */
class SetOfStacks{
	//Array,��С�ɱ����飬�̲߳�ͬ��
	ArrayList<Stack> stacks=new ArrayList<Stack>();
	public int capacity;
	public SetOfStacks(int c){
		//����capacity�ĳ�ֵ���ó�ֵΪÿ����ջ���������
		capacity=c;
	}
	/**
	 * �õ���ǰ�����һ����ջ
	 * @return
	 */
	public Stack getLastStack(){
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
	}
	/**
	 * ��ջ
	 * @param v
	 */
	public void push(int v){
		Stack last=getLastStack();
		if(last!=null&&!last.isFull())
			/*���һ��ջ������û��*/
			last.push(v);
		else{
			/*�½���һ����ջ*/
			Stack stack=new  Stack(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	/**
	 * ��ջ
	 * @return
	 */
	public int pop(){
		Stack last=getLastStack();
		int v=last.pop();
		if(last.size==0)
			//����ǰջ�Կգ��Ƴ���ǰջ�����Բ��������ٴγ�ջ��ʱ��ջΪ�յ����
			stacks.remove(stacks.size()-1);
		return v;
		}
	/**
	 * �ж����һ��ջ�Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty(){
		Stack last=getLastStack();
		return last==null||last.isEmpty();
	}
	/**
	 * ����һ����ջ�ײ���Ԫ���Ƶ�ǰһ����ջ��ջ��
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
	 * ѡ���ض���ջ��ջ
	 * @param index
	 * @return
	 */
	public int popAt(int index){
		return leftShift(index,true);
	}
}