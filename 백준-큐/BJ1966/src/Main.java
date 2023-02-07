import java.util.*;

class List{
    public int imp;    //중요도
    public int x;        //문서의 인덱스

    public List(int i, int x){
        this.imp = i;
        this.x =  x;
    }
}

public class Main {
    public static void main(String[] args) {
        int T, N, M, imp, cnt = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        Queue<List> queue = new LinkedList<>();
        T = sc.nextInt();
        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            M = sc.nextInt();
            for (int j = 0; j < N; j++) {
                imp = sc.nextInt();
                queue.add(new List(imp, j)); //큐에 List객체 추가
                pq.add(imp);
            }
            boolean check = true;   //원하는 수를 구하면 false로 바꿔준다.
            while (check) {
                if (queue.peek().imp == pq.peek()) {
                    if (queue.poll().x == M) {
                        result[i] = ++cnt;
                        check = false;
                    }
                    pq.poll();
                    cnt++;
                } else {
                    queue.add(queue.poll());
                }
            }
            cnt = 0;
            queue.clear();
            pq.clear();
        }
        for(int i=0; i<T;i++)
            System.out.println(result[i]);
    }
}

