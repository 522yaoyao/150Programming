package practice;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		char[] c={'h','e','l','l','o'};
		System.out.println(s.equals(c));

	}
	abstract class Test{
		int c=5;
	    public void method(){
	    	
	    }
	    //无法分辨的重载方法，变成抽象方法也是错误的
	//    public abstract int method();
	}

}
