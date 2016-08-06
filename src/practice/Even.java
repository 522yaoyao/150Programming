package practice;

public class Even extends Thread{
	public Even(String s){
		msg=s;
	}
	String msg;
	public void run(){
		System.out.println(msg);
	}
	public static void main(String[] args){
		new Even("Hello");
		new Even("World");
	}

}
