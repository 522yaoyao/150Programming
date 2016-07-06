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
	 * ��д����ʹ��ջ��������(����Ԫ����ջ��)�����ֻ��ʹ��һ������Ķ�ջ�����ʱ���ݣ����ǲ��������ݸ��Ƶ����������ݽṹ��
	 * �������飩����ջ֧��push(),pop(),isEmpty(),peek()������
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
