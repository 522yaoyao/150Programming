package designpattern;

import java.util.ArrayList;

public class FactoryTwo{
	public static void main(String[] args){
		PizzaStoreTwo nyPizzaStore = new NYStylePizzaStoreTwo();// 创建纽约披萨商店
		PizzaTwo pizza = nyPizzaStore.orderPizza("cheese");// 在纽约披萨商店订起司披萨
		System.out.println("披萨的名字： " + pizza.getName());
		System.out.println("面团的名字： " + pizza.dough.name);
		System.out.println("酱料的名字： " + pizza.sauce.name);
		System.out.println("起司的名字:" + pizza.cheese.name);
		PizzaStoreTwo chicagoPizzaStore = new ChicagoStylePizzaStoreTwo();
		PizzaTwo pizza2 = chicagoPizzaStore.orderPizza("clam");// 在纽约披萨商店订起司披萨
		System.out.println("披萨的名字： " + pizza2.getName());
		System.out.println("面团的名字： " + pizza2.dough.name);
		System.out.println("酱料的名字： " + pizza2.sauce.name);
		System.out.println("起司的名字:" + pizza2.cheese.name);
	}
}

// 创建原料的接口
abstract class PizzaIngredientFactory{
	// 每个原料都有一个对应的方法创建该原料
	abstract Dough createDough();// 面团

	abstract Sauce createSauce();// 酱料

	abstract Cheese createCheese();// 起司
}

class NYPizzaIngredientFactory extends PizzaIngredientFactory{

	public Dough createDough(){
		return new ThinCrustDough();
	}

	public Sauce createSauce(){
		return new MarinaraSauce();// 大蒜番茄酱料
	}

	public Cheese createCheese(){
		return new ReggianoCheese();// Reggiano干酪
	}

}

// 芝加哥原料工厂
class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory{

	public Dough createDough(){
		return new ThickDough();
	}

	public Sauce createSauce(){
		return new PlumSauce();// 大蒜番茄酱料
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

// 不关心原料，只关心如何制作披萨，披萨和区域原料之间被解耦
abstract class PizzaTwo{// 抽象类，可以有一些具体的实现
	private String name;// 披萨名称
	Dough dough;// 面团
	Sauce sauce;// 酱
	Cheese cheese;// 起司
	ArrayList toppings = new ArrayList();// 一套佐料

	abstract void prepare();// 此方法声明成抽象方法，因为我们需要在此方法中收集披萨所需的原料，而这些原料来自原料工厂；

	public void bake(){
		System.out.println("烘烤25分钟");
	}

	public void cut(){
		System.out.println("把这个披萨对角切片");
	}

	public void box(){
		System.out.println("请将披萨放入披萨商店的官方盒子里");
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}

// 起司披萨
class CheesePizza extends PizzaTwo{
	PizzaIngredientFactory ingredientFactory;

	// 制作披萨需要原料，所以实例化一个原料工厂
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void prepare(){
		System.out.println("正在准备  " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

// 蛤蛎
class ClamPizza extends PizzaTwo{
	PizzaIngredientFactory ingredientFactory;

	// 制作披萨需要原料，所以实例化一个原料工厂
	public ClamPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void prepare(){
		System.out.println("正在准备  " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

class PepperoniPizza extends PizzaTwo{
	PizzaIngredientFactory ingredientFactory;

	// 制作披萨需要原料，所以实例化一个原料工厂
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void prepare(){
		System.out.println("正在准备  " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

/**
 * 作为一个超类，让每个类型的披萨商店继承它
 * @author liuyao
 */
abstract class PizzaStoreTwo{
	public final PizzaTwo orderPizza(String type){// 向工厂定制披萨,防止被子类覆盖
		PizzaTwo pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// 抽象产品由子类制造，创建者不需要真的知道在制造哪种具体产品
	abstract PizzaTwo createPizza(String type);// 把制作披萨的方法从工厂里移到这个方法中
}

// 纽约风味披萨
class NYStylePizzaStoreTwo extends PizzaStoreTwo{
	PizzaTwo createPizza(String item){
		PizzaTwo pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();// 纽约原料工厂
		if(item.equals("cheese")){// 起司披萨
			pizza = new CheesePizza(ingredientFactory);// 将纽约原料工厂传递给起司披萨
			pizza.setName("New York Style Cheese Pizza");
		}else if(item.equals("pepperoni")){// 辣香肠披萨
			pizza = new PepperoniPizza(ingredientFactory);// 将纽约原料工厂传递给起司披萨
			pizza.setName("New York Style pepperoni Pizza");
		}else if(item.equals("clam")){// 海鲜披萨
			pizza = new ClamPizza(ingredientFactory);// 将纽约原料工厂传递给起司披萨
			pizza.setName("New York Style clam Pizza");
		}
		return pizza;
	}
}

// 纽约风味披萨
class ChicagoStylePizzaStoreTwo extends PizzaStoreTwo{
	PizzaTwo createPizza(String item){
		PizzaTwo pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();// 纽约原料工厂
		if(item.equals("cheese")){// 起司披萨
			pizza = new CheesePizza(ingredientFactory);// 将纽约原料工厂传递给起司披萨
			pizza.setName("Chicago Style Cheese Pizza");
		}else if(item.equals("pepperoni")){// 辣香肠披萨
			pizza = new PepperoniPizza(ingredientFactory);// 将纽约原料工厂传递给起司披萨
			pizza.setName("Chicago Style pepperoni Pizza");
		}else if(item.equals("clam")){// 海鲜披萨
			pizza = new ClamPizza(ingredientFactory);// 将纽约原料工厂传递给起司披萨
			pizza.setName("Chicago Style clam Pizza");
		}
		return pizza;
	}
}
