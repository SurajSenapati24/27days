public class RotateMatrix {
    public static void reverse(int matrix[][],int row,int start,int end){
        while(start<=end){
            int temp=matrix[row][start];
            matrix[row][start]=matrix[row][end];
            matrix[row][end]=temp;
            start++;
            end--;
        }
    }
    public static void soltuion(int matrix[][]){
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix, i, 0, n-1);
        }
    }
    public static void printMatrix(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        soltuion(matrix);
        printMatrix(matrix);
    }
}
