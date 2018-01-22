package designpattern;

//������߳�
public class SingleObjectTwo{

}

/**
* ����ʽ
* �Ƿ�Lazy��ʼ������
* �Ƿ���̰߳�ȫ����
* ʵ���Ѷȣ���
* ����:���ַ�ʽ�߱��ܺõ�lazy loading,�ܹ��ڶ��߳��кܺõĹ���������Ч�ʵͣ����̣߳���99%����²���Ҫͬ����
* �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷�
* ȱ�������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
* getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
*/
class Singleton{
	private static Singleton uniqueInstance;

	private Singleton(){}// ��ֻ֤��һ��ʵ��������

	// ��ȡʵ����������
	// ͨ������synchronized �ؼ��ֵ�getInstance()�����У�������ʹÿ���߳��ڽ����ⷽ��֮ǰ��Ҫ�ȵȺ����߳�
	// �뿪�Ƿ�����Ҳ����˵�����������߳̿���ͬʱ�������������
	public static synchronized Singleton getInstance(){
		if(null == uniqueInstance) uniqueInstance = new Singleton();
		return uniqueInstance;

	}

}
