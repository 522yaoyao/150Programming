package one;

public class OneEigth {
	public static void main(String[ ]  args){
        String a="watletter";
        String b="letterwat";
        OneEigth one=new OneEigth();
	System.out.println(one.isRotation(a,b));
	}/**
	*���������ַ������ж�s2�Ƿ���s1��ת���ɣ���֪�ж�һ���ַ�����
	*������һ�������ִ��ķ���������letterwat��watletter��letterΪ��ת��
	*��ת���ɵ��ַ�����
	*/
public boolean isRotation(String s1,String s2){
	if((s1.length()==s2.length())&&(s1.length()>0)){
		String s1s1=s1+s1;
		return  s1s1.contains(s2);
	}
	return false;
}
}
