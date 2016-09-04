package practice.instanceof1;

import java.util.Comparator;
/**
 * instanceof的三个用法；
 * @author zx
 *
 */
public class Test {
	public static void main(String[] args){
		Model m=new Model(2);
			m.print();//类中的私有变量可以通过公有方法从外部调用；
			//t.print1();
			Boolean result1= m instanceof Model;
			Boolean result2= m instanceof Object;
			Boolean result3= m instanceof Comparator;
			System.out.println(result1);//判断一个对象是否是一个类的实例；
			System.out.println(result2);//判断一个此对象是否一个子类的
			System.out.println(result3);//判断一个对象是否实现了某个接口；
	}

}
