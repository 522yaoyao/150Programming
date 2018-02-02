package designpattern;

//ģ��ģʽ
public class Template{
	public static void main(String[] args){
		Cricket cricket = new Cricket();
		cricket.play();

		Football football = new Football();
		football.play();

	}

}

abstract class Game{

	// ��ʼ����Ϸ
	abstract void initialize();

	// ��ʼ��Ϸ
	abstract void startPlay();

	// ������Ϸ
	abstract void endPlay();

	// ģ�壺Ϊ��ֹ���������һ��ģ�巽��������final �ؼ���
	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}
}

class Cricket extends Game{

	@Override
	void initialize(){
		System.out.println("Cricket��Ϸ��ʼ����������Ϸ��ʼ��");
	}

	@Override
	void startPlay(){
		System.out.println("Cricket��Ϸ�Ѿ���ʼ��������Ϸ��");
	}

	@Override
	void endPlay(){
		System.out.println("Cricket��Ϸ������");
	}
}

class Football extends Game{

	@Override
	void initialize(){
		System.out.println("Football��Ϸ��ʼ����������Ϸ��ʼ��");
	}

	@Override
	void startPlay(){
		System.out.println("Football��Ϸ�Ѿ���ʼ��������Ϸ��");
	}

	@Override
	void endPlay(){
		System.out.println("Football��Ϸ������");
	}
}
