package designpattern;

import java.util.ArrayList;

/**
 * �۲���ģʽ�������˶�����һ��һ�Զ�������ϵ��ʹ��ÿ��һ������ı�״̬��
 * ���������������Ķ��󶼻�õ�֪ͨ�����Զ����¡�
 * @author zx
 *
 */
public class ObservablerOne{
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(24, 65, 30.4f);
		weatherData.setMeasurements(23, 55, 30.4f);

		weatherData.removeObserver(currentDisplay);// �Ƴ���ǰ�۲���
	}

}

interface Subject{

	void registerObserver(Observer o);// ע��۲��ߣ���Ҫһ���۲��߱�����

	void removeObserver(Observer o);// �Ƴ��۲��ߣ���Ҫһ���۲��߱�����
	// ֪ͨ�۲���

	void notifyObservers();// ������״̬�ı�ʱ��������������ã���֪ͨ���еĹ۲���
}

interface Observer{
	// ���й۲��߶�����ʵ��update����
	void update(float temperature, float humidity, float pressure);// ���۲�ֵ�ı�ʱ,��������Щ״ֵ̬�����������������ݸ��۲���
}

interface DisplayElement{
	void display();
}

class WeatherData implements Subject{
	private ArrayList observers;// ������¼�۲���
	private float temperature;// ����
	private float humidity;// ʪ��
	private float pressure;// ��ѹ

	public WeatherData(){
		observers = new ArrayList();
	}

	// ע��۲���
	public void registerObserver(Observer o){
		observers.add(o);
		System.out.println("ע����һλ�۲��ߣ�");
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
			System.out.println("�Ƴ���һλ�۲��ߣ�");
		}
	}

	public void notifyObservers(){
		// ֪ͨÿһλ�۲���
		for(int i = 0, length = observers.size(); i < length; i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	/**
	 * �۲�ֵ�ı䣬��Ҫ֪ͨ�۲���
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
		weatherData.registerObserver(this);// �����������ݶ���ע��۲���
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display(){
		System.out.println("��ǰ��״̬�� ���¶�===" + temperature + " ʪ��===" + humidity);
	}
}
