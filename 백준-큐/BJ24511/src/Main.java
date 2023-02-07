import java.util.*;

class QueueStack{
    public Queue queue;
    public Stack stack;

    public QueueStack(){
        queue = new LinkedList();
        stack = new Stack();
    }
}
public class Main {
    public static void main(String[] args){
        int N, M;
        String result="";
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        QueueStack[] qs = new QueueStack[N];
        int[] a = new int[N];

        for(int i=0; i<N; i++) a[i]=sc.nextInt();

        for(int i=0; i<N; i++){
            if(a[i]==0){
                qs[i] = new QueueStack();
                qs[i].queue.add(sc.nextInt());
            }
            else{
                qs[i] = new QueueStack();
                qs[i].stack.push(sc.nextInt());
            }
        }

        M= sc.nextInt();
        for(int i=0; i<M; i++){
            int c = sc.nextInt();
            for(int j=0; j<N; j++){
                if(a[j]==0){
                    qs[j].queue.add(c);
                    c = (int)qs[j].queue.poll();
                    //System.out.println(c);
                }
                else{
                    //System.out.println(c);
                    qs[j].stack.push(c);
                    //System.out.println(qs[j].stack.peek());
                    c = (int)qs[j].stack.pop();
                }
            }
            result +=c+" ";
        }
        System.out.println(result);
    }
}
