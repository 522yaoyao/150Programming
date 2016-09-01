package one;

public class OneTen {
	public static void main(String[] args){
		String str="I come from China.";
		str=print(str);
		System.out.println(str);
	}
	public  static  String  print(String str){
		String[] s=str.split(" ");
		StringBuilder str2=new StringBuilder();
		for(int i=s.length-1;i>=0;i--){
		 str2.append(s[i]);
		 str2.append(" ");
		}
   return str2.toString();
   //String 类型传值；
//System.out.println(str);

	}
	

}
