package two;

import java.util.Stack;

public class TwoSeven {
	public static void main(String[] args){
		LinkList link=new LinkList();
		int[] a={1,2,3,2,1};
		link.initLinkList(a);
		System.out.println(isPalindromeLink(link.first.next ));
		System.out.println(isPalindromeLink2(link.first.next));
		
	}
public static Result isPalindrome(Node head,int length){
	if(head==null||length==0){
		return new Result(null,true);
	}
	else if(length==1){
		return new Result(head.next ,true);
		}
	else if(length==2){
		return new Result(head.next.next,head.data==head.next.data);
	}
	
	Result res=isPalindrome(head.next,length-2);
	//res.node==null?
     if(!res.result||res.node==null){
		return res;
	}
     else{
	res.result=(head.data==res.node.data);
	res.node=res.node.next;
	return res;
     }
}
/**
 * �ж�һ�������Ƿ��ǻ��ģ��ݹ鷨��
 * @param head
 * @return
 */
public static boolean isPalindromeLink(Node head){
	Result res=isPalindrome(head, head.length(head));
	return res.result ;
}
/**
 * �ж�һ�������Ƿ��ǻ���������������ǰ�벿�ֵĽڵ���ջ����
 * @param head
 * @return
 */
public static boolean isPalindromeLink2(Node head){
	Node fast=head;
	Node slow=head;
	Stack<Integer> stack=new Stack<Integer>();
	while(fast!=null&&fast.next!=null){
		fast=fast.next.next;
		stack.push(slow.data);
		slow=slow.next;
		}
	//�ڵ����Ϊ������
	if(fast!=null){
		//Խ���м�ڵ�
		slow=slow.next;
	}
	while(slow!=null){
		int top=stack.pop().intValue();
		if(top!=slow.data){
			return false;
		}
		slow=slow.next;
	}
	return true;
}
}
/*һ��������*/
class Result{
	Node node;
	boolean result;
	public Result(Node n,boolean t){
		node=n;
		result=t;
	}
}
