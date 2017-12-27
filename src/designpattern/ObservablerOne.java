package designpattern;

import java.util.ArrayList;

/**
 * 观察者模式：定义了对象间的一种一对多依赖关系，使得每当一个对象改变状态，
 * 则所有依赖于它的对象都会得到通知并被自动更新。
 * @author zx
 *
 */
public class ObservablerOne{
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(24, 65, 30.4f);
		weatherData.setMeasurements(23, 55, 30.4f);

		weatherData.removeObserver(currentDisplay);// 移除当前观察者
	}

}

interface Subject{

	void registerObserver(Observer o);// 注册观察者（需要一个观察者变量）

	void removeObserver(Observer o);// 移除观察者（需要一个观察者变量）
	// 通知观察者

	void notifyObservers();// 当主题状态改变时，这个方法被调用，以通知所有的观察者
}

interface Observer{
	// 所有观察者都必须实现update方法
	void update(float temperature, float humidity, float pressure);// 当观测值改变时,主题会把这些状态值当作方法参数，传递给观察者
}

interface DisplayElement{
	void display();
}

class WeatherData implements Subject{
	private ArrayList observers;// 用来记录观察者
	private float temperature;// 气温
	private float humidity;// 湿度
	private float pressure;// 气压

	public WeatherData(){
		observers = new ArrayList();
	}

	// 注册观察者
	public void registerObserver(Observer o){
		observers.add(o);
		System.out.println("注册了一位观察者！");
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
			System.out.println("移除了一位观察者！");
		}
	}

	public void notifyObservers(){
		// 通知每一位观察者
		for(int i = 0, length = observers.size(); i < length; i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	/**
	 * 观测值改变，需要通知观察者
	 */
	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}

class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);// 传递天气数据对象，注册观察者
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display(){
		System.out.println("当前的状态是 ：温度===" + temperature + " 湿度===" + humidity);
	}
}
