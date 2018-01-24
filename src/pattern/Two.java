package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//捕获组
public class Two{
	public static void main(String args[]){

		// 按指定模式在字符串查找
		String line = "This order was placed for QT9863000!OK";
		/**
		 * 将匹配的字符串分成了三组，分别是（0个或者多个非数字字符）（一个及以上数字字符）（任意字符）
		 * 第一组匹配(\\D*)，"\\"转义后是"\"
		 * 第二组匹配(\\d+)
		 * 第三组匹配(.*)
		 * 第零组匹配整个字符串
		 */
		String pattern = "(\\D*)(\\d+)(.*)";

		// 创建 Pattern 对象
		Pattern r = Pattern.compile(pattern);

		// 现在创建 matcher 对象
		Matcher m = r.matcher(line);
		if(m.find()){
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
			System.out.println("Found value: " + m.group(3));
		}else{
			System.out.println("NO MATCH");
		}
	}
}
