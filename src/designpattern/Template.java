package designpattern;

//模板模式
public class Template{
	public static void main(String[] args){
		Cricket cricket = new Cricket();
		cricket.play();

		Football football = new Football();
		football.play();

	}

}

abstract class Game{

	// 初始化游戏
	abstract void initialize();

	// 开始游戏
	abstract void startPlay();

	// 结束游戏
	abstract void endPlay();

	// 模板：为防止恶意操作，一般模板方法都加上final 关键词
	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}
}

class Cricket extends Game{

	@Override
	void initialize(){
		System.out.println("Cricket游戏初始化，板球游戏开始啦");
	}

	@Override
	void startPlay(){
		System.out.println("Cricket游戏已经开始，享受游戏吧");
	}

	@Override
	void endPlay(){
		System.out.println("Cricket游戏结束了");
	}
}

class Football extends Game{

	@Override
	void initialize(){
		System.out.println("Football游戏初始化，板球游戏开始啦");
	}

	@Override
	void startPlay(){
		System.out.println("Football游戏已经开始，享受游戏吧");
	}

	@Override
	void endPlay(){
		System.out.println("Football游戏结束了");
	}
}
