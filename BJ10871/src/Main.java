import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int N;
        int X;
        int[] arr;

        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N];
        X=sc.nextInt();

        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<X)
                System.out.print(arr[i]+" ");
        }
    }
}
