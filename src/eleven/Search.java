package eleven;

public class Search {
	public static void main(String[] arg){
		int[] a={3,2,1,6,7,4,5};
		MySort.quickSort(a, 0, a.length-1);
		//int index=bunarySearch(a,3);
		int index=bunarySearchRecursive(a,7,0,a.length-1);
		System.out.println(index);
		
	}
	/**
	 * 二分查找(递归）
	 * @param arr
	 * @param x
	 * @param low
	 * @param high
	 * @return
	 */
	public static int bunarySearchRecursive(int[] arr,int x,int low,int high){
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(x>arr[mid])
			return bunarySearchRecursive(arr,x,mid+1,high);
		
		 if(x<arr[mid])
		return 	bunarySearchRecursive(arr,x,low,mid-1);
		
			else
				return mid;
		
		
	}
	/**
	 * 二分查找
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int bunarySearch(int[] arr,int x){
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(x>arr[mid])
				low=mid+1;
			if(x<arr[mid])
				high=mid-1;
			else
				return mid;
		}
		return -1;
	}


}
