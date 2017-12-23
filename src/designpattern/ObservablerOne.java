package designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式：定义了对象间的一种一对多依赖关系，使得每当一个对象改变状态，
 * 则所有依赖于它的对象都会得到通知并被自动更新。
 * @author zx
 *
 */
public class ObservablerOne {
	  public static void main(final String[] args)
	    {
	        final ConcreteSubject sb = new ConcreteSubject();
	        sb.setTemperature((float) 20.00);

	        final Observer o = new ConcreteObserver(sb);
	        sb.setTemperature((float) 21.00);

	    }
}

 interface Observer
{
    public void update(float temprature);
}

 class ConcreteObserver implements Observer
 {
     private float temperature;
     private final Subject subject;

     public ConcreteObserver(final Subject subject)
     {
         this.subject = subject;
         this.subject.registerObserver(this);
     }

     public float getTemperature()
     {
         return temperature;
     }

     public void setTemperature(final float temperature)
     {
         this.temperature = temperature;
     }

     @Override
     public void update(final float temperature)
     {
         this.temperature = temperature;
     }
 }
 
 interface Subject
{
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
 
 class ConcreteSubject implements Subject
 {
     private final List<Observer> observers;
     private float temperature;

     public float getTemperature()
     {
         return temperature;
     }

     private void temperatureChanged()
     {
         this.notifyObservers();
     }

     public void setTemperature(final float temperature)
     {
         this.temperature = temperature;
         this.temperatureChanged();
     }

     public ConcreteSubject()
     {
         observers = new ArrayList<Observer>();
     }

     @Override
     public void registerObserver(final Observer o)
     {
         observers.add(o);
     }

     @Override
     public void removeObserver(final Observer o)
     {
         if (observers.indexOf(o) >= 0)
         {
             observers.remove(o);
         }
     }

     @Override
     public void notifyObservers()
     {
         for (final Observer o : observers)
         {
             o.update(temperature);
         }
     }
 }