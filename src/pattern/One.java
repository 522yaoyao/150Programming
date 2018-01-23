package pattern;

import java.util.regex.Pattern;

public class One{
	public static void main(String args[]){
		String content = "I am noob" + "from runoobcom";

		String pattern = ".*runoob.*";

		// -------------------------------正则表达式，要匹配的内容
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串是否包含了'runoob子串 ?'" + isMatch);
	}

}
