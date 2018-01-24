package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//start和end方法
public class Three{
	public static void main(String args[]){
		String REGEX = "\\bcat\\b";
		String INPUT = "cat cat cat catthhyhie cat";
		matchCat(REGEX, INPUT);
	}

	/**
	 * 单词 "cat" 出现在输入字符串中出现次数进行计数的例子
	 * @param pattern 正则表达式
	 * @param content 需要匹配的字符串
	 */
	public static void matchCat(String pattern, String content){
		Pattern p = Pattern.compile(pattern);// 将正则表达式编译到模式中
		Matcher m = p.matcher(content);// 整个区域与模式匹配
		int count = 0;// 匹配的次数
		// 部分匹配，假设匹配成功，返回true,匹配的位置移动到下次匹配的位置
		while(m.find()){
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());

		}
	}

}
