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

/**
 * ����ʽ
 * �Ƿ�Lazy��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 * ����:���ַ�ʽ�Ƚϳ��ã��������ײ�����������
 * �ŵ㣺û�м�����ִ��Ч�ʻ����
 * ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
 * ����classloder���Ʊ����˶��̵߳�ͬ�����⣬������instance����װ��ʱ��ʵ����
 */
class SingleObject{

	// �������óɾ�̬��ԭ���������ֻ����һ��ʵ������̬�����ĺ�����ǡ����е�ʵ����������һ����Ա������
	private static SingleObject instance = new SingleObject();// ���ײ������������˷��ڴ�

	// ���캯�����ó�private����Ͳ��ᱻʵ����
	private SingleObject(){}

	public static SingleObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("Hello World");
	}

}
