package designpattern;

//普通的播放器，只能播放mp3;
interface MediaPlayer{
	void play(String fileName);
}

//目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类
//可以播放更加高级的音频playVlc,playMp4
interface AdvancedMediaPlayer{
	void playVlc();

	void playMp4();
}

//适配器类可以播放playVlc,playMp4的类

class MediaAdapter implements AdvancedMediaPlayer{

	public void playVlc(){
		System.out.println("播放Vlc");
	}

	public void playMp4(){
		System.out.println("播放MP4");
	}

	public void play(String fileName){
		if("vlc".equalsIgnoreCase(fileName)) playVlc();
		else if("mp4".equalsIgnoreCase(fileName)) playMp4();
	}

}

class Audioplayer implements MediaPlayer{
	MediaAdapter dediaAdapter;// 可以支持播放vlc,mp4

	public void play(String fileName){
		// 内置支持播放MP3
		if("mp3".equalsIgnoreCase(fileName)) System.out.println("播放MP3 ");
		else if("vlc".equalsIgnoreCase(fileName) || "mp4".equalsIgnoreCase(fileName)){
			dediaAdapter = new MediaAdapter();
			dediaAdapter.play(fileName);
		}else System.out.println("此音频类型不适合播放");
	}
}

public class Adapter{

	public static void main(String[] args){
		Audioplayer audioplayer = new Audioplayer();
		audioplayer.play("mp3");
		audioplayer.play("mp4");
		audioplayer.play("vlc");
		audioplayer.play("avi");
	}
}
