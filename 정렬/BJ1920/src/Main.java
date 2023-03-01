import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int M;
        int[] m;
        for(int i=0; i<N; i++)
            A[i] = sc.nextInt();
        M= sc.nextInt();
        m=new int[M];
        for(int i=0; i<M; i++)
            m[i] = sc.nextInt();

        loop: for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(m[i]==A[j]) {
                    System.out.println("1");
                    continue loop;
                }
            }
            System.out.println("0");
        }
    }
}
