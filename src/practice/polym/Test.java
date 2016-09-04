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
		dog.print();
		dog.print();
	}

}
