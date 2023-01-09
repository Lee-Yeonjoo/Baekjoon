import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr;
        final int stu = 30;
        int x;
        Scanner sc = new Scanner(System.in);

        arr = new int[stu];
        for(int i=0;i<28;i++){
            x= sc.nextInt();
            arr[x-1]++;
        }

        for(int i=0; i<arr.length;i++) {
            if (arr[i] != 1)
                System.out.println(i+1);
        }
    }
}
