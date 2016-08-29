package five;

public class FiveFive {
	public static void main(String[] args){
		int num=countNum(4,7);
		System.out.println(num);
	}
	/**
	 * 确定将改变几位才能将整数a,变为整数b;
	 * @param a
	 * @param b
	 * @return
	 */
	public static  int countNum(int a,int b){
		int count=0;//局部变量必须初始化；
		for(int num=a^b;num!=0;num=num>>1){//每次右移一次，判断最低位是否为1（判断一共有多少个1）；
			count+=num&1;
			
		}
		return count;
	}

}
