
import java.util.Scanner;
class MatrixRotation{
    public static void main(String[] args){
        int n=3;
        Scanner sc= new Scanner(System.in);
        int[][] matrix = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;

            }
        }

        for(int col=0;col<n;col++){
            int top=0,bottom=n-1;
            while(top<bottom){
                int temp=matrix[top][col];
                matrix[top][col]=matrix[bottom][col];
                matrix[bottom][col] = temp;
                top++;
                bottom--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        sc.close();
    }
}
