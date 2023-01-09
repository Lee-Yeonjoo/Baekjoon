import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int x;
        int cnt=0;

        for(int i=0; i<arr.length;i++) arr[i]=-1;

        for(int i =0; i<arr.length;i++){
            x=sc.nextInt();
            LinearSearch ls = new LinearSearch(arr, 10, x%42);
            if(!ls.search()){
                arr[i]=x%42;
            }
            else
                arr[i]=-1;
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]!=-1)
                cnt++;
        }
        System.out.println(cnt);
    }
}
