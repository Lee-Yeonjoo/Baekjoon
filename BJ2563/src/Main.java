import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[][] m = new int[100][100];
        int x;  //색종이의 수
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        int a;
        int b;
        int cnt=0;

        for(int i=0; i<x;i++) {
            b=sc.nextInt()-1;
            a=sc.nextInt()-1;
            for(int j=a; j<a+10;j++){
                for(int k=b; k<b+10; k++){
                    m[j][k]=1;
                }
            }
        }

        for(int i=0; i<m.length;i++){
            for(int j=0; j<m[i].length;j++){
                if(m[i][j]==1)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
