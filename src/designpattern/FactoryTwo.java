package designpattern;

import java.util.ArrayList;

public class FactoryTwo{
	public static void main(String[] args){
		PizzaStoreTwo nyPizzaStore = new NYStylePizzaStoreTwo();// ����ŦԼ�����̵�
		PizzaTwo pizza = nyPizzaStore.orderPizza("cheese");// ��ŦԼ�����̵궩��˾����
		System.out.println("���������֣� " + pizza.getName());
		System.out.println("���ŵ����֣� " + pizza.dough.name);
		System.out.println("���ϵ����֣� " + pizza.sauce.name);
		System.out.println("��˾������:" + pizza.cheese.name);
		PizzaStoreTwo chicagoPizzaStore = new ChicagoStylePizzaStoreTwo();
		PizzaTwo pizza2 = chicagoPizzaStore.orderPizza("clam");// ��ŦԼ�����̵궩��˾����
		System.out.println("���������֣� " + pizza2.getName());
		System.out.println("���ŵ����֣� " + pizza2.dough.name);
		System.out.println("���ϵ����֣� " + pizza2.sauce.name);
		System.out.println("��˾������:" + pizza2.cheese.name);
	}
}

// ����ԭ�ϵĽӿ�
abstract class PizzaIngredientFactory{
	// ÿ��ԭ�϶���һ����Ӧ�ķ���������ԭ��
	abstract Dough createDough();// ����

	abstract Sauce createSauce();// ����

	abstract Cheese createCheese();// ��˾
}

class NYPizzaIngredientFactory extends PizzaIngredientFactory{

	public Dough createDough(){
		return new ThinCrustDough();
	}

	public Sauce createSauce(){
		return new MarinaraSauce();// ���ⷬ�ѽ���
	}

	public Cheese createCheese(){
		return new ReggianoCheese();// Reggiano����
	}

}

// ֥�Ӹ�ԭ�Ϲ���
class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory{

	public Dough createDough(){
		return new ThickDough();
	}

	public Sauce createSauce(){
		return new PlumSauce();// ���ⷬ�ѽ���
	}

	public Cheese createCheese(){
		return new MozzaCheese();//
	}

}

abstract class Dough{
	String name;
}

class ThickDough extends Dough{
	public ThickDough(){
		name = "ThickDough";
	}
}

class ThinCrustDough extends Dough{

	public ThinCrustDough(){
		name = "ThinCrustDough";
	}
}

abstract class Sauce{
	String name;
}

class MarinaraSauce extends Sauce{

	public MarinaraSauce(){
		name = "MarinaraSauce";
	}
}

class PlumSauce extends Sauce{

	public PlumSauce(){
		name = "PlumSauce";
	}
}

abstract class Cheese{
	String name;
}

class ReggianoCheese extends Cheese{

	public ReggianoCheese(){
		name = "ReggianoCheese";
	}
}

class MozzaCheese extends Cheese{

	public MozzaCheese(){
		name = "MozzaCheese";
	}
}

// ������ԭ�ϣ�ֻ���������������������������ԭ��֮�䱻����
abstract class PizzaTwo{// �����࣬������һЩ�����ʵ��
	private String name;// ��������
	Dough dough;// ����
	Sauce sauce;// ��
	Cheese cheese;// ��˾
	ArrayList toppings = new ArrayList();// һ������

	abstract void prepare();// �˷��������ɳ��󷽷�����Ϊ������Ҫ�ڴ˷������ռ����������ԭ�ϣ�����Щԭ������ԭ�Ϲ�����

	public void bake(){
		System.out.println("�濾25����");
	}

	public void cut(){
		System.out.println("����������Խ���Ƭ");
	}

	public void box(){
		System.out.println("�뽫�������������̵�Ĺٷ�������");
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}

// ��˾����
class CheesePizza extends PizzaTwo{
	PizzaIngredientFactory ingredientFactory;

	// ����������Ҫԭ�ϣ�����ʵ����һ��ԭ�Ϲ���
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void prepare(){
		System.out.println("����׼��  " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

// ����
class ClamPizza extends PizzaTwo{
	PizzaIngredientFactory ingredientFactory;

	// ����������Ҫԭ�ϣ�����ʵ����һ��ԭ�Ϲ���
	public ClamPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void prepare(){
		System.out.println("����׼��  " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

class PepperoniPizza extends PizzaTwo{
	PizzaIngredientFactory ingredientFactory;

	// ����������Ҫԭ�ϣ�����ʵ����һ��ԭ�Ϲ���
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void prepare(){
		System.out.println("����׼��  " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

/**
 * ��Ϊһ�����࣬��ÿ�����͵������̵�̳���
 * @author liuyao
 */
abstract class PizzaStoreTwo{
	public final PizzaTwo orderPizza(String type){// �򹤳���������,��ֹ�����า��
		PizzaTwo pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// �����Ʒ���������죬�����߲���Ҫ���֪�����������־����Ʒ
	abstract PizzaTwo createPizza(String type);// �����������ķ����ӹ������Ƶ����������
}

// ŦԼ��ζ����
class NYStylePizzaStoreTwo extends PizzaStoreTwo{
	PizzaTwo createPizza(String item){
		PizzaTwo pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();// ŦԼԭ�Ϲ���
		if(item.equals("cheese")){// ��˾����
			pizza = new CheesePizza(ingredientFactory);// ��ŦԼԭ�Ϲ������ݸ���˾����
			pizza.setName("New York Style Cheese Pizza");
		}else if(item.equals("pepperoni")){// ���㳦����
			pizza = new PepperoniPizza(ingredientFactory);// ��ŦԼԭ�Ϲ������ݸ���˾����
			pizza.setName("New York Style pepperoni Pizza");
		}else if(item.equals("clam")){// ��������
			pizza = new ClamPizza(ingredientFactory);// ��ŦԼԭ�Ϲ������ݸ���˾����
			pizza.setName("New York Style clam Pizza");
		}
		return pizza;
	}
}

// ŦԼ��ζ����
class ChicagoStylePizzaStoreTwo extends PizzaStoreTwo{
	PizzaTwo createPizza(String item){
		PizzaTwo pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();// ŦԼԭ�Ϲ���
		if(item.equals("cheese")){// ��˾����
			pizza = new CheesePizza(ingredientFactory);// ��ŦԼԭ�Ϲ������ݸ���˾����
			pizza.setName("Chicago Style Cheese Pizza");
		}else if(item.equals("pepperoni")){// ���㳦����
			pizza = new PepperoniPizza(ingredientFactory);// ��ŦԼԭ�Ϲ������ݸ���˾����
			pizza.setName("Chicago Style pepperoni Pizza");
		}else if(item.equals("clam")){// ��������
			pizza = new ClamPizza(ingredientFactory);// ��ŦԼԭ�Ϲ������ݸ���˾����
			pizza.setName("Chicago Style clam Pizza");
		}
		return pizza;
	}
}
