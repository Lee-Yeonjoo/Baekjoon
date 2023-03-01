import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        Integer[] b = new Integer[N]; //래퍼클래스로 해야 오류가 안뜸..
        int sum=0;
        int max;

        for(int i=0; i<N; i++)
            A[i]= sc.nextInt();
        for(int i=0; i<N; i++) {
            B[i] = sc.nextInt();
            b[i] = B[i];
        }

        Arrays.sort(A); //오름차순
        Arrays.sort(b, Collections.reverseOrder()); //내림차순

        for(int i=0; i<N; i++){
            sum += A[i]*b[i];
        }

        System.out.println(sum);
    }
}
