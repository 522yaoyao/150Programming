package designpattern;

import java.util.ArrayList;

/**
 * 工厂模式
 * @author liuyao
 */
public class Factory{
	public static void main(String[] args){
		PizzaStore nyPizzaStore = new NYStylePizzaStore();// 创建一个纽约披萨商店
		PizzaStore chicagostore = new ChicagoStylePizzaStore();// 创建一个芝加哥商店

		Pizza pizza = nyPizzaStore.orderPizza("cheese");// 在纽约商店定制一个起司披萨
		System.out.println("定制的披萨是： " + pizza.getName() + "\n");

		pizza = chicagostore.orderPizza("cheese");// 在芝加哥定制一款辣香肠披萨
		System.out.println("定制的披萨是：" + pizza.getName());

	}
}

/**
 * 作为一个超类，让每个类型的披萨继承它
 * @author liuyao
 */
abstract class PizzaStore{
	public final Pizza orderPizza(String type){// 向工厂定制披萨,防止被子类覆盖
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String type);// 把制作披萨的方法从工厂里移到这个方法中
}

// 纽约风味披萨
class NYStylePizzaStore extends PizzaStore{
	Pizza createPizza(String item){
		if(item.equals("cheese")){// 起司披萨
			return new NYStyleCheesePizza();
		}else if(item.equals("pepperoni")){// 辣香肠披萨
			return new NYStylePepperoniPizza();
		}else if(item.equals("clam")){// 海鲜披萨
			return new NYStyleClamPizza();
		}else return null;

	}
}

// 芝加哥风味披萨
class ChicagoStylePizzaStore extends PizzaStore{
	Pizza createPizza(String item){
		if(item.equals("cheese")){// 起司披萨
			return new ChicagoStyleCheesePizza();
		}else if(item.equals("pepperoni")){// 辣香肠披萨
			return new ChicagoStylePepperoniPizza();
		}else if(item.equals("clam")){// 海鲜披萨
			return new ChicagoStyleClamPizza();
		}else return null;

	}
}

abstract class Pizza{// 抽象类，可以有一些具体的实现
	String name;// 披萨名称
	String dough;// 面团
	String sauce;// 酱
	ArrayList toppings = new ArrayList();// 一套佐料

	void prepare(){
		System.out.println("准备：" + name);
		System.out.println("准备开始....");
		System.out.println("添加酱料");
		System.out.print("添加配料:");
		for(int i = 0, length = toppings.size(); i < length; i++)
			System.out.println("  " + toppings.get(i));
	}

	public void bake(){
		System.out.println("烘烤25分钟");
	}

	public void cut(){
		System.out.println("把这个披萨对角切片");
	}

	public void box(){
		System.out.println("请将披萨放入披萨商店的官方盒子里");
	}

	public String getName(){
		return name;
	}
}

class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza(){
		name = "纽约起司披萨";
		dough = "壳薄面团";
		sauce = "蕃茄酱";

		toppings.add("磨碎的巴马干酪奶酪");
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
		name = "芝加哥式深碟芝士比萨 ";
		dough = "特厚面皮";
		sauce = "李子番茄酱";

		toppings.add("切碎的奶酪");// 意大利白干酪
	}

	// 重写了切披萨的方法
	public void cut(){
		System.out.println("把比萨饼切成方形");
	}

}

class ChicagoStylePepperoniPizza extends Pizza{
	public ChicagoStylePepperoniPizza(){
		name = "Chicago Style Deep Dish pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella pepperoni");// 意大利白干酪
	}

	// 重写了切披萨的方法
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}

}

class ChicagoStyleClamPizza extends Pizza{
	public ChicagoStyleClamPizza(){
		name = "Chicago Style Deep Dish Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Clam");// 意大利白干酪
	}

	// 重写了切披萨的方法
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}

}
