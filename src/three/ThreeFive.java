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
 * 实现一个MyQueue类，该类用两个堆栈实现一个队列
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
	 * 返回此队列当前的大小
	 * @return
	 */
	public int size(){
		return stackNewest.size()+stackOldest.size();
	}
	/**
	 * 入队
	 * @param value
	 */
	public void add(T value){
		stackNewest.push(value);
	}
	/**
	 * 将stackNewest中的元素逆序存入stackOldest中
	 */
	public void shift(){
		/*若stackOldest栈为空，将stackNewest中的元素逆序存入stackOldest中*/
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	/**
	 * 出队
	 * @return
	 */
	public T remove(){
		shift();//确保stackOldest中有元素
		return stackOldest.pop();
		
	}
	/**
	 * 查看队列最前面的元素
	 * @return
	 */
	public T peek(){
		shift();
		return stackOldest.peek();
	}
}
