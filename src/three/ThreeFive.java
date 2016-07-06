package three;

import java.util.Stack;

public class ThreeFive {
	public static void main(String[] args){
		MyQueue<Integer> queue=new MyQueue<Integer>();
		int[] a={1,2,3,4,5,6,7};
		for(int i=0;i<a.length;i++){
			queue.add(a[i]);
		}
	//	System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
	}

}
/**
 * ʵ��һ��MyQueue�࣬������������ջʵ��һ������
 * @author zx
 *
 * @param <T>
 */
class MyQueue<T>{
	Stack<T> stackNewest,stackOldest;
	public MyQueue(){
		stackNewest=new Stack<T>();
		stackOldest=new Stack<T>();
	}
	/**
	 * ���ش˶��е�ǰ�Ĵ�С
	 * @return
	 */
	public int size(){
		return stackNewest.size()+stackOldest.size();
	}
	/**
	 * ���
	 * @param value
	 */
	public void add(T value){
		stackNewest.push(value);
	}
	/**
	 * ��stackNewest�е�Ԫ���������stackOldest��
	 */
	public void shift(){
		/*��stackOldestջΪ�գ���stackNewest�е�Ԫ���������stackOldest��*/
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	/**
	 * ����
	 * @return
	 */
	public T remove(){
		shift();//ȷ��stackOldest����Ԫ��
		return stackOldest.pop();
		
	}
	/**
	 * �鿴������ǰ���Ԫ��
	 * @return
	 */
	public T peek(){
		shift();
		return stackOldest.peek();
	}
}
