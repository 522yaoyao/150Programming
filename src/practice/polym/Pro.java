package practice.polym;

/**
 * 上转型
 * @author zx
 *
 */
public class Pro {
  public static void main(String[] args){
	
	  Base base=new Son();//多态，上转型；
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
	int a=10;//继承父类的变量只是值得复制，子类改变变量的值对父类没有影响；
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