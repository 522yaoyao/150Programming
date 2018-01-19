package designpattern;

public class SingleObjectOne{
	public static void main(String[] args){
		// ���캯�����������ǲ��ɼ���
		// SingleObject object=new SingleObject();

		// ��ȡΨһ���õĶ���
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}

class SingleObject{

	// �������óɾ�̬��ԭ���������ֻ����һ��ʵ������̬�����ĺ�����ǡ����е�ʵ����������һ����Ա������
	private static SingleObject instance = new SingleObject();

	// ���캯�����ó�private����Ͳ��ᱻʵ����
	private SingleObject(){}

	public static SingleObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("Hello World");
	}

}
