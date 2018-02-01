package designpattern;

//外观模式
public class Facade{
	// 客户角色，调用外观类实现功能
	public static void main(String[] args){
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}

//-------------------------------------------------子系统角色-----------------------
interface Shape{
	void draw();
}

//矩形
class Rectangle implements Shape{
	public void draw(){
		System.out.println("画矩形");
	}
}

//正方形
class Square implements Shape{
	public void draw(){
		System.out.println("画正方形");
	}
}

//画圆
class Circle implements Shape{

	public void draw(){
		System.out.println("画圆");
	}
}

//-------------------------------子系统角色结束---------------------------

//外观类：外观模式的核心，被客户角色调用，熟悉子系统的功能，内部根据客户角色的需求预定了几种功能组合
class ShapeMaker{
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle(){
		circle.draw();
	}

	public void drawRectangle(){
		rectangle.draw();
	}

	public void drawSquare(){
		square.draw();
	}
}
