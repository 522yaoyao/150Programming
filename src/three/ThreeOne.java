package three;

public class ThreeOne {
	/*将异常交给上机处理，main函数抛出的异常由虚拟机处理*/
	public static void main(String[] args) throws Exception{
		StackThree stack=new StackThree();
		stack.push(0, 2);
		int value=stack.pop(0);
		System.out.println(value);
				stack.pop(0);
		
		
	}

}
/**
 * 用一个数组实现三个栈（固定分割）；
 * @author zx
 *
 */

class StackThree{
	private int stackSize=100;
	private int[] buffer=new int[stackSize*3];
	private int[] stackPoint={-1,-1,-1};
	/*入栈*/
	public void push(int stackNum,int value)throws Exception{
		if(stackPoint[stackNum]+1>=stackSize){
			throw new Exception("Out of stack.");
		}
		    stackPoint[stackNum]++;
			buffer[absToTopOfStack(stackNum)]=value;
		}
	/*出栈*/
	public int  pop(int stackNum)throws Exception{
		if(stackPoint[stackNum]==-1){
			throw new  Exception("Try to pop an empty stack");
		}
		
			int value=buffer[absToTopOfStack(stackNum)];
			/*出栈元素清零*/
			buffer[absToTopOfStack(stackNum)]=0;
		    stackPoint[stackNum]--;
		    return value;
		}
	/*查看栈顶元素*/
	public int  peek(int stackNum){
		return buffer[absToTopOfStack(stackNum)];
	}
	/*判断堆栈是否为空*/
	boolean isEmpty(int stackNum){
		return stackPoint[stackNum]==-1;
	}
	/*返回栈"stackNum"的索引的绝对值*/
	public int absToTopOfStack(int stackNum){
		return stackNum*stackSize+stackPoint[stackNum];
	}
}

