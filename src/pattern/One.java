package pattern;

import java.util.regex.Pattern;

public class One{
	public static void main(String args[]){
		String content = "I am noob" + "from runoobcom";

		String pattern = ".*runoob.*";

		// -------------------------------������ʽ��Ҫƥ�������
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("�ַ����Ƿ������'runoob�Ӵ� ?'" + isMatch);
	}

}
