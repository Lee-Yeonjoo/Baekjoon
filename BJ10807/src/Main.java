import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int N;
        int[] arr;
        int v;
        int cnt=0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        v = sc.nextInt();

        for(int i=0; i<arr.length;i++){
            if(arr[i] == v)
                cnt++;
        }

        System.out.println(cnt);

    }
}
