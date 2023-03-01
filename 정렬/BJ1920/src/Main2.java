import java.util.*;
public class Main2{
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

        quickSort(A);

        for(int i=0; i<M; i++){
            if(BSearch(A,m[i]))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }

    public static boolean BSearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < n) left = mid + 1;
            else if (arr[mid] > n) right = mid - 1;
            else return true;
        }
        return false;
    }

    public static void quickSort(int[] A){
        qSort(A,0,A.length-1);
    }

    private static void qSort(int[] A, int p, int r){
        if(p<r){
            int q=partition(A, p,r);
            qSort(A, p,q-1);
            qSort(A,q+1,r);
        }
    }

    private static int partition(int[] A, int p, int r){
        int x=A[r];
        int i=p-1;
        int tmp;
        for(int j=p; j<=r-1; j++){
            if(A[j]<=x){
                i++;
                tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
        tmp=A[i+1];
        A[i+1]=A[r];
        A[r]=tmp;
        return i+1;
    }
}
