package three;

public class ThreeOne {
	/*���쳣�����ϻ�����main�����׳����쳣�����������*/
	public static void main(String[] args) throws Exception{
		StackThree stack=new StackThree();
		stack.push(0, 2);
		int value=stack.pop(0);
		System.out.println(value);
				stack.pop(0);
		
		
	}

}
/**
 * ��һ������ʵ������ջ���̶��ָ��
 * @author zx
 *
 */

class StackThree{
	private int stackSize=100;
	private int[] buffer=new int[stackSize*3];
	private int[] stackPoint={-1,-1,-1};
	/*��ջ*/
	public void push(int stackNum,int value)throws Exception{
		if(stackPoint[stackNum]+1>=stackSize){
			throw new Exception("Out of stack.");
		}
		    stackPoint[stackNum]++;
			buffer[absToTopOfStack(stackNum)]=value;
		}
	/*��ջ*/
	public int  pop(int stackNum)throws Exception{
		if(stackPoint[stackNum]==-1){
			throw new  Exception("Try to pop an empty stack");
		}
		
			int value=buffer[absToTopOfStack(stackNum)];
			/*��ջԪ������*/
			buffer[absToTopOfStack(stackNum)]=0;
		    stackPoint[stackNum]--;
		    return value;
		}
	/*�鿴ջ��Ԫ��*/
	public int  peek(int stackNum){
		return buffer[absToTopOfStack(stackNum)];
	}
	/*�ж϶�ջ�Ƿ�Ϊ��*/
	boolean isEmpty(int stackNum){
		return stackPoint[stackNum]==-1;
	}
	/*����ջ"stackNum"�������ľ���ֵ*/
	public int absToTopOfStack(int stackNum){
		return stackNum*stackSize+stackPoint[stackNum];
	}
}

