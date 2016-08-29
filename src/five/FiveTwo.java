package five;

public class FiveTwo {
	public static void main(String[] args){
		String bi=printBinary(0.75);
		System.out.println(bi);
		
	}
	/**
	 * 将十进制小数转化为二进制小数；
	 * @param num
	 * @return
	 */
	public static String printBinary(double num){
		if(num>=1||num<=0)
			return "ERROR1";
		StringBuilder binary=new StringBuilder();//线程不安全；
// System.out.println(binary.length());	   
		binary.append("0.");
//System.out.println(binary.length());	   
		while(num>0){
		   if(binary.length()>=32){
//System.out.println(binary.length());	   
			    return "ERROR2";}
			double r=num*2;
			if(r>=1){
				binary.append(1);
				num=r-1;
			}
			else{
				binary.append(0);
				num=r;
			}
		}
		
	return binary.toString();	
	}

}
