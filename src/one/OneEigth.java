package one;

public class OneEigth {
	public static void main(String[ ]  args){
        String a="watletter";
        String b="letterwat";
        OneEigth one=new OneEigth();
	System.out.println(one.isRotation(a,b));
	}/**
	*给定两个字符串，判断s2是否由s1旋转而成，已知判定一个字符串是
	*否是另一个串的字串的方法，例如letterwat是watletter以letter为旋转点
	*旋转而成的字符串。
	*/
public boolean isRotation(String s1,String s2){
	if((s1.length()==s2.length())&&(s1.length()>0)){
		String s1s1=s1+s1;
		return  s1s1.contains(s2);
	}
	return false;
}
}
