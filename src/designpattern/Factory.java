package designpattern;

import java.util.ArrayList;

/**
 * ����ģʽ
 * @author liuyao
 */
public class Factory{
	public static void main(String[] args){
		PizzaStore nyPizzaStore = new NYStylePizzaStore();// ����һ��ŦԼ�����̵�
		PizzaStore chicagostore = new ChicagoStylePizzaStore();// ����һ��֥�Ӹ��̵�

		Pizza pizza = nyPizzaStore.orderPizza("cheese");// ��ŦԼ�̵궨��һ����˾����
		System.out.println("���Ƶ������ǣ� " + pizza.getName() + "\n");

		pizza = chicagostore.orderPizza("cheese");// ��֥�Ӹ綨��һ�����㳦����
		System.out.println("���Ƶ������ǣ�" + pizza.getName());

	}
}

/**
 * ��Ϊһ�����࣬��ÿ�����͵������̳���
 * @author liuyao
 */
abstract class PizzaStore{
	public final Pizza orderPizza(String type){// �򹤳���������,��ֹ�����า��
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String type);// �����������ķ����ӹ������Ƶ����������
}

// ŦԼ��ζ����
class NYStylePizzaStore extends PizzaStore{
	Pizza createPizza(String item){
		if(item.equals("cheese")){// ��˾����
			return new NYStyleCheesePizza();
		}else if(item.equals("pepperoni")){// ���㳦����
			return new NYStylePepperoniPizza();
		}else if(item.equals("clam")){// ��������
			return new NYStyleClamPizza();
		}else return null;

	}
}

// ֥�Ӹ��ζ����
class ChicagoStylePizzaStore extends PizzaStore{
	Pizza createPizza(String item){
		if(item.equals("cheese")){// ��˾����
			return new ChicagoStyleCheesePizza();
		}else if(item.equals("pepperoni")){// ���㳦����
			return new ChicagoStylePepperoniPizza();
		}else if(item.equals("clam")){// ��������
			return new ChicagoStyleClamPizza();
		}else return null;

	}
}

abstract class Pizza{// �����࣬������һЩ�����ʵ��
	String name;// ��������
	String dough;// ����
	String sauce;// ��
	ArrayList toppings = new ArrayList();// һ������

	void prepare(){
		System.out.println("׼����" + name);
		System.out.println("׼����ʼ....");
		System.out.println("��ӽ���");
		System.out.print("�������:");
		for(int i = 0, length = toppings.size(); i < length; i++)
			System.out.println("  " + toppings.get(i));
	}

	public void bake(){
		System.out.println("�濾25����");
	}

	public void cut(){
		System.out.println("����������Խ���Ƭ");
	}

	public void box(){
		System.out.println("�뽫�������������̵�Ĺٷ�������");
	}

	public String getName(){
		return name;
	}
}

class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza(){
		name = "ŦԼ��˾����";
		dough = "�Ǳ�����";
		sauce = "ެ�ѽ�";

		toppings.add("ĥ��İ����������");
	}
}

class NYStylePepperoniPizza extends Pizza{
	public NYStylePepperoniPizza(){
		name = "NY Style Sauce and Cheese Pepperoni";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Pepperoni");
	}
}

class NYStyleClamPizza extends Pizza{
	public NYStyleClamPizza(){
		name = "NY Style Sauce and Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Clam");
	}
}

class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(){
		name = "֥�Ӹ�ʽ���֥ʿ���� ";
		dough = "�غ���Ƥ";
		sauce = "���ӷ��ѽ�";

		toppings.add("���������");// ������׸���
	}

	// ��д���������ķ���
	public void cut(){
		System.out.println("�ѱ������гɷ���");
	}

}

class ChicagoStylePepperoniPizza extends Pizza{
	public ChicagoStylePepperoniPizza(){
		name = "Chicago Style Deep Dish pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella pepperoni");// ������׸���
	}

	// ��д���������ķ���
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}

}

class ChicagoStyleClamPizza extends Pizza{
	public ChicagoStyleClamPizza(){
		name = "Chicago Style Deep Dish Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Clam");// ������׸���
	}

	// ��д���������ķ���
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}

}
