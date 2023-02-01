import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args){
        int N;
        int x;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        Stack<Integer> score = new Stack<>();
        Stack<Integer> cnt = new Stack<>();
        N = sc.nextInt();

        for(int i=0; i<N; i++){
            x = sc.nextInt();
            if(x == 1){
                score.push(sc.nextInt());
                cnt.push(sc.nextInt());
                cnt.push(cnt.pop()-1);
                if (cnt.peek() == 0) {
                    sum += score.pop();
                    cnt.pop();
                }
                
            }
            else{
                if(!cnt.isEmpty()) {
                    cnt.push(cnt.pop()-1);
                    if (cnt.peek() == 0) {
                        sum += score.pop();
                        cnt.pop();
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

