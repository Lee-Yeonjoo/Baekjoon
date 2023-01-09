import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int N;
        int M;
        int[][] A;
        int[][] B;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        A=new int[N][M];
        B=new int[N][M];

        for(int i=0; i<A.length;i++){
            for(int j=0; j<A[i].length;j++){
                A[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<B.length;i++){
            for(int j=0; j<B[i].length;j++){
                B[i][j]=sc.nextInt()+A[i][j];
            }
        }

        for(int i=0; i<B.length;i++){
            for(int j=0; j<B[i].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

    }
}
