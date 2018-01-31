package designpattern;

//��ͨ�Ĳ�������ֻ�ܲ���mp3;
interface MediaPlayer{
	void play(String fileName);
}

//Ŀ��(Target)��ɫ����������ڴ��õ��Ľӿڡ�ע�⣺�����������۵�����������ģʽ�����Ŀ�겻��������
//���Բ��Ÿ��Ӹ߼�����ƵplayVlc,playMp4
interface AdvancedMediaPlayer{
	void playVlc();

	void playMp4();
}

//����������Բ���playVlc,playMp4����

class MediaAdapter implements AdvancedMediaPlayer{

	public void playVlc(){
		System.out.println("����Vlc");
	}

	public void playMp4(){
		System.out.println("����MP4");
	}

	public void play(String fileName){
		if("vlc".equalsIgnoreCase(fileName)) playVlc();
		else if("mp4".equalsIgnoreCase(fileName)) playMp4();
	}

}

class Audioplayer implements MediaPlayer{
	MediaAdapter dediaAdapter;// ����֧�ֲ���vlc,mp4

	public void play(String fileName){
		// ����֧�ֲ���MP3
		if("mp3".equalsIgnoreCase(fileName)) System.out.println("����MP3 ");
		else if("vlc".equalsIgnoreCase(fileName) || "mp4".equalsIgnoreCase(fileName)){
			dediaAdapter = new MediaAdapter();
			dediaAdapter.play(fileName);
		}else System.out.println("����Ƶ���Ͳ��ʺϲ���");
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
