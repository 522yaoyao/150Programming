package one;

public class OneSeven {
	public static void main(String[ ]  args){
		int[][] b={{1,0,1},{4,5,6},{4,7,8},{4,3,3}};
		OneSeven one=new OneSeven();
		int[][] a=one.setZeros(b);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	/**
	 * 若一个M*N的矩阵中元素为0，则将它所在的行和列均清为零；	
	 * @param matrix
	 * @return
	 */
	
public int[][] setZeros(int[][] matrix){
	boolean[] row=new boolean[matrix.length];//获得数组的行数
	boolean[] column=new boolean[matrix[0].length];//获得数组的列数
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[0].length;j++){
			if(matrix[i][j]==0){
				row[i]=true;
				column[j]=true;
			}
		}
	}
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[0].length;j++){
			if(row[i]||column[j])
				matrix[i][j]=0;
		}
	}
	return matrix;
}
}
