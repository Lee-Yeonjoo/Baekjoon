public class Sorting {
    int[] A;
    public Sorting(int[] B){
        A = B;
    }

    public int[] getArray(){
        return A;
    }

    //퀵 정렬
    public void quickSort(){
        qSort(0,A.length-1);
    }

    private void qSort(int p, int r){
        if(p<r){
            int q=partition(p,r);
            qSort(p,q-1);
            qSort(q+1,r);
        }
    }

    private int partition(int p, int r){
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
