package designpattern;

//���ģʽ
public class Facade{
	// �ͻ���ɫ�����������ʵ�ֹ���
	public static void main(String[] args){
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}

//-------------------------------------------------��ϵͳ��ɫ-----------------------
interface Shape{
	void draw();
}

//����
class Rectangle implements Shape{
	public void draw(){
		System.out.println("������");
	}
}

//������
class Square implements Shape{
	public void draw(){
		System.out.println("��������");
	}
}

//��Բ
class Circle implements Shape{

	public void draw(){
		System.out.println("��Բ");
	}
}

//-------------------------------��ϵͳ��ɫ����---------------------------

//����ࣺ���ģʽ�ĺ��ģ����ͻ���ɫ���ã���Ϥ��ϵͳ�Ĺ��ܣ��ڲ����ݿͻ���ɫ������Ԥ���˼��ֹ������
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
