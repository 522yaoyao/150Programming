package practice.polym;

/**
 * 定义一个抽象类
 * @author zx
 *
 */
 abstract class Animals{
	public abstract  void print();
}

class Dog extends Animals{
	@Override
	public void print(){
		System.out.println("汪汪汪");
	}
}

class Cat extends Animals{
	@Override
	public void print(){
		System.out.println("喵喵喵");
	}
}