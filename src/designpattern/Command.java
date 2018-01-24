package designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式
 * @author liuyao
 */
public class Command{
	public static void main(String[] args){
		Stock abcStock = new Stock();// 创建一个股票对象

		BuyStock buyStockOrder = new BuyStock(abcStock);// 创建买股票的命令对象
		SellStock sellStockOrder = new SellStock(abcStock);// 创建卖股票的命令对象

		Broker broker = new Broker();// 创建命令调用实例
		broker.takeOrder(buyStockOrder);// 添加命令；
		broker.takeOrder(sellStockOrder);// 添加命令；
		broker.takeOrder(sellStockOrder);// 添加命令；
		broker.placeOrders();// 执行命令；
	}

}

// 创建一个命令接口
interface Order{
	void execute();
}

// 创建一个请求类
class Stock{// 股票

	private String name = "ABC";
	private int quantity = 10;// 量

	public void buy(){
		quantity += 5;
		System.out.println("股票【" + name + "】买了5份，现在的数量是：" + quantity);
	}

	public void sell(){
		quantity -= 3;
		System.out.println("股票【" + name + "】卖了3份，现在的数量是：" + quantity);
	}

}

// 创建实现了Order接口的实体类
class BuyStock implements Order{
	private Stock abcStock;

	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	// 执行买股票的操作
	public void execute(){
		abcStock.buy();
	}
}

class SellStock implements Order{
	private Stock abcStock;

	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	// 执行卖股票的操作
	public void execute(){
		abcStock.sell();
	}
}

// 创建命令调用类
class Broker{
	private List<Order> orderList = new ArrayList<Order>();

	// 添加命令
	public void takeOrder(Order order){
		orderList.add(order);
	}

	// 执行命令
	public void placeOrders(){
		for(Order order : orderList)
			order.execute();
		orderList.clear();
	}
}
