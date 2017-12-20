package practice.polym;

public class One {
	//上转型对象先根据栈中的引用（父类）去父类中寻找合适的方法，如果这个方法被堆中实例对象的类（子类）重写，就调用子类的方法，如果没有就调用父类的
	public static void main(String[] args){
		A a1=new A();
		A a2=new B();
		B b=new B();
		a1.show(a1);
		a2.show(a2);
		a2.show(a1);
		D d=new D();
		C c=new C();
		a2.show(d);
		a2.show(c);
		System.out.println("---------------------------------------------------------");
		a1.show(b);//调用A类中的show(A obj)方法
		a1.show(c);//调用A类中的show(A obj)方法
		a1.show(d);//调用A类中的show(D obj)方法，因为要选择最恰当的方法，若A类中无show(D obj),则选择show(A obj);
		//a2是上转型对象
		a2.show(b);//原本应该调用A类里的show(A obj)方法，但是它的子类B里重写了show(A obj)方法，所以调用B类里的show(A obj)方法
		b.show(b);
		a2.show(c);//原本应该调用A类里的show(A obj)方法，但是它的子类B里重写了show(A obj)方法，所以调用B类里的show(A obj)方法
		a2.show(d);//应该调用A类里的show(A obj)方法,且它的子类B里没有重写show(D obj)方法，所以调用A类里的show(D obj)方法
		b.show(b);//调用B类的show(B obj)方法
		b.show(c);//调用B类的show(B obj)方法,因为C是B的子类
		b.show(d);//其实B类中默认了已经有了show(A obj)--覆盖， show(B obj)--新增， show(D obj)--继承，所以选择最恰当的show(D obj)
     }
}

class A{
	public void  show(A obj){
		System.out.println("class A and obj A");
	}
	
	public void  show(D obj){
		System.out.println("class A and obj D");
	}
}

class B extends A{
	public void  show(A obj){
		System.out.println("class B and obj A");
	}
	
	public void show(B obj){
		System.out.println("class B and obj B");
	}
}

class D extends B{}

class C extends B{}

