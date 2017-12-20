package practice.polym;

/**
 * 多态的实现
 * @author zx
 *
 */
public class Test {
	public static void main(String[] args){
		//上转型；
		Animals dog=new Dog();
		Animals cat=new Cat();
		//多态的实现；
		dog.print();//去父类中寻找对应的方法，子类如果重写了这个方法就调用子类的
		cat.print();
	}

}
