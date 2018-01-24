package designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ģʽ
 * @author liuyao
 */
public class Command{
	public static void main(String[] args){
		Stock abcStock = new Stock();// ����һ����Ʊ����

		BuyStock buyStockOrder = new BuyStock(abcStock);// �������Ʊ���������
		SellStock sellStockOrder = new SellStock(abcStock);// ��������Ʊ���������

		Broker broker = new Broker();// �����������ʵ��
		broker.takeOrder(buyStockOrder);// ������
		broker.takeOrder(sellStockOrder);// ������
		broker.takeOrder(sellStockOrder);// ������
		broker.placeOrders();// ִ�����
	}

}

// ����һ������ӿ�
interface Order{
	void execute();
}

// ����һ��������
class Stock{// ��Ʊ

	private String name = "ABC";
	private int quantity = 10;// ��

	public void buy(){
		quantity += 5;
		System.out.println("��Ʊ��" + name + "������5�ݣ����ڵ������ǣ�" + quantity);
	}

	public void sell(){
		quantity -= 3;
		System.out.println("��Ʊ��" + name + "������3�ݣ����ڵ������ǣ�" + quantity);
	}

}

// ����ʵ����Order�ӿڵ�ʵ����
class BuyStock implements Order{
	private Stock abcStock;

	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	// ִ�����Ʊ�Ĳ���
	public void execute(){
		abcStock.buy();
	}
}

class SellStock implements Order{
	private Stock abcStock;

	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	// ִ������Ʊ�Ĳ���
	public void execute(){
		abcStock.sell();
	}
}

// �������������
class Broker{
	private List<Order> orderList = new ArrayList<Order>();

	// �������
	public void takeOrder(Order order){
		orderList.add(order);
	}

	// ִ������
	public void placeOrders(){
		for(Order order : orderList)
			order.execute();
		orderList.clear();
	}
}
