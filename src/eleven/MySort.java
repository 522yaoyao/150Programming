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
	 * 冒泡排序
	 * 从数组的第一个元素开始依次比较两个元素，前者大于后者就交换位置，继续处理下一对，直到排序完成
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
	 * 选择排序
	 * 首先遍历列表将最小元素与第一个元素进行交换，随后遍历剩余的元素，并将次小的元素与第二个元素进行交换，依此类推。
	 * @param a
	 */
	public static void selectionSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			int m=i;
			for(int j=i;j<a.length;j++){
				if(a[j]<a[m]){
					m=j;//使a[m]为数组的最小值
				}
					if(m!=i)
						swap(a,i,m);
			}
		}
		
	}
	/**
	 * 直接插入排序
	 * 每一步都是将一个待排数据按其大小插入已排好序的数组中，直到全部插入完毕
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
	 * 交换两个数
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
			//将数组左右两边的元素复制到helper数组中（将要排序的元素复制进helper数组的对应位置中),并不是整个数组；
			helper[i]=array[i];
		}
		int helperleft=low;
		int helperright=middle+1;
		int current=low;
		/*
		 * 迭代访问helper数组，比较左右数组将较小的元素复制到原来的数组中
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
		 * 将左侧数组中的剩余元素复制会原来的数组中
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
		mergesort(array,low,middle);//排序左半部分
		mergesort(array,middle+1,high);//排序右半部分
		merge(array,low,middle,high);//归并
	}
	
}
/**
 * 归并排序
 * 将数组分成两半，两半分别排序后，再归并到一起。排序某一半时，继续沿用同样的排序算法，最终，将归并两个只含有一个元素的数组；
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
 * 快速排序
 * 随机挑选一个元素，对数组进行分割，将所有比它小的元素排在前面，比它大的排在后面，如此反复。
 * @param arr
 * @param left
 * @param right
 * @return
 */

public static int partition(int arr[],int left,int right){
	int pivot=arr[(left+right)/2];
	while(left<=right){//对每个值都进行判断，若是条件为(left<right),则两个指针相等时所对应的值无法进行判断。
		while(arr[left]<pivot)
			left++;//最终指针指向大于等于pivot的元素；
		while(arr[right]>pivot)
			right--;//只要符合条件就会继续走下去；直到遇到的数小于等于pivot；
	
		if(left<=right){
			swap(arr,left,right);
			left++;
			right--;
		}
	}System.out.println("当前索引为"+left+" 值为"+arr[left]);
	print(arr);
	return left;
}

}
