package eleven;

public class MySort {
	public static void main(String[] args){
	//	int[] array={1,3,5,7,2};
		int[] a={1,3,6,10,9,8,10,7};
		//bubbleSort(array);
		//selectionSort(array);
		//injectionSort(array);
		quickSort(a,0,a.length-1);
	//	print(a);
		
	}
	/**
	 * ð������
	 * ������ĵ�һ��Ԫ�ؿ�ʼ���αȽ�����Ԫ�أ�ǰ�ߴ��ں��߾ͽ���λ�ã�����������һ�ԣ�ֱ���������
	 * @param a
	 */
	public static void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1])
					swap(a,j,j+1);
			}
		}
		
		
	}
	/**
	 * ѡ������
	 * ���ȱ����б���СԪ�����һ��Ԫ�ؽ��н�����������ʣ���Ԫ�أ�������С��Ԫ����ڶ���Ԫ�ؽ��н������������ơ�
	 * @param a
	 */
	public static void selectionSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			int m=i;
			for(int j=i;j<a.length;j++){
				if(a[j]<a[m]){
					m=j;//ʹa[m]Ϊ�������Сֵ
				}
					if(m!=i)
						swap(a,i,m);
			}
		}
		
	}
	/**
	 * ֱ�Ӳ�������
	 * ÿһ�����ǽ�һ���������ݰ����С�������ź���������У�ֱ��ȫ���������
	 * @param a
	 */
	public static void injectionSort(int[] a){
		for(int j=1;j<a.length;j++){
			int tmp=a[j];
			int i=j-1;
			while(tmp<a[i]){
				a[i+1]=a[i];
				i--;
				if(i==-1)
					break;
			}
			a[i+1]=tmp;
		}
		
		
		
		
	}
	/**
	 * ����������
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(int[] a,int i,int j){
		int t;
		t=a[i];
		a[i]=a[j];
		a[j]=t;
		
	}
	public static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	public static void merge(int[] array,int low,int middle,int high){
		int[] helper=new int[array.length];
		for(int i=low;i<=high;i++){
			//�������������ߵ�Ԫ�ظ��Ƶ�helper�����У���Ҫ�����Ԫ�ظ��ƽ�helper����Ķ�Ӧλ����),�������������飻
			helper[i]=array[i];
		}
		int helperleft=low;
		int helperright=middle+1;
		int current=low;
		/*
		 * ��������helper���飬�Ƚ��������齫��С��Ԫ�ظ��Ƶ�ԭ����������
		 */
		while(helperleft<=middle&&helperright<=high){
			if(helper[helperleft]<=helper[helperright]){
				array[current]=helper[helperleft];
				helperleft++;
			}
			else{
				array[current]=helper[helperright];
				helperright++;
			}
			current++;
		}
		/**
		 * ����������е�ʣ��Ԫ�ظ��ƻ�ԭ����������
		 */
		//int remaining=middle-helperleft;
		for(int i=helperleft;i<=middle;i++){
			array[current]=helper[i];
			current++;
		}
		
	}
public static void mergesort(int[] array,int low,int high){
	if(low<high){
		int middle=(low+high)/2;
		mergesort(array,low,middle);//������벿��
		mergesort(array,middle+1,high);//�����Ұ벿��
		merge(array,low,middle,high);//�鲢
	}
	
}
/**
 * �鲢����
 * ������ֳ����룬����ֱ�������ٹ鲢��һ������ĳһ��ʱ����������ͬ���������㷨�����գ����鲢����ֻ����һ��Ԫ�ص����飻
 * @param array
 */
public static void mergeSort(int[] array){
	mergesort(array,0,array.length-1);
}
public static void quickSort(int[] arr,int left,int right){
	int index=partition(arr,left,right);
	if(left<index-1)
		quickSort(arr,left,index-1);
	if(index<right)
		quickSort(arr,index,right);
}
/**
 * ��������
 * �����ѡһ��Ԫ�أ���������зָ�����б���С��Ԫ������ǰ�棬����������ں��棬��˷�����
 * @param arr
 * @param left
 * @param right
 * @return
 */

public static int partition(int arr[],int left,int right){
	int pivot=arr[(left+right)/2];
	while(left<=right){//��ÿ��ֵ�������жϣ���������Ϊ(left<right),������ָ�����ʱ����Ӧ��ֵ�޷������жϡ�
		while(arr[left]<pivot)
			left++;//����ָ��ָ����ڵ���pivot��Ԫ�أ�
		while(arr[right]>pivot)
			right--;//ֻҪ���������ͻ��������ȥ��ֱ����������С�ڵ���pivot��
	
		if(left<=right){
			swap(arr,left,right);
			left++;
			right--;
		}
	}System.out.println("��ǰ����Ϊ"+left+" ֵΪ"+arr[left]);
	print(arr);
	return left;
}

}
