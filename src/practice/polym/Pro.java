package practice.polym;

/**
 * ��ת��
 * @author zx
 *
 */
public class Pro {
  public static void main(String[] args){
	
	  Base base=new Son();//��̬����ת�ͣ�
	  System.out.println("base.a  "+base.a);
	  base.prin();
	  
	  Son son=new Son();
	  son.a=30;
	  System.out.println("son.a "+son.a);
	  Base b=new Base();
	  System.out.println("b.a "+b.a);
  }
}

class Base{
	int a=10;//�̳и���ı���ֻ��ֵ�ø��ƣ�����ı������ֵ�Ը���û��Ӱ�죻
	public void prin(){
		System.out.println(a);
	}
}

class Son extends Base{
	int a=20;
	public void prin(){
		System.out.println(a);
	}
}