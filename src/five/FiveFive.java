package five;

public class FiveFive {
	public static void main(String[] args){
		int num=countNum(4,7);
		System.out.println(num);
	}
	/**
	 * ȷ�����ı伸λ���ܽ�����a,��Ϊ����b;
	 * @param a
	 * @param b
	 * @return
	 */
	public static  int countNum(int a,int b){
		int count=0;//�ֲ����������ʼ����
		for(int num=a^b;num!=0;num=num>>1){//ÿ������һ�Σ��ж����λ�Ƿ�Ϊ1���ж�һ���ж��ٸ�1����
			count+=num&1;
			
		}
		return count;
	}

}
