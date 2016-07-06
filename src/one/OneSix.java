package one;

public class OneSix {
	public static  void main(String[ ]  args){
		int[][] b={{1,1,1,2},{4,5,6,2},{4,7,8,2},{4,3,3,3}};
		OneSix one=new OneSix();
		int[][] a=one.rotate(b, 4);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	/**
	 * 给定一个由N*N组成的矩阵，使图像旋转90度，不占任何额外的空间；
	 */
public int[][] rotate(int[][] matrix,int n){
	for(int layer=0;layer<n/2;layer++){
		int first=layer;
		int last=n-1-layer;
		for(int i=first;i<last;i++){
			int offset=i-first;
			int top=matrix[first][i];
			matrix[first][i]=matrix[last-offset][first];
			matrix[last-offset][first]=matrix[last][last-offset];
			matrix[last][last-offset]=matrix[i][last];
			matrix[i][last]=top;
		}
	}
	return matrix;
}
}
