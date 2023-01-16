import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int x;
        int sum=0;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<K; i++){
            x=sc.nextInt();
            if(x!=0)
                st.push(x);
            else
                st.pop();
        }

        int t = st.size();

        for(int i=0; i<t; i++){
            sum+=st.pop();
        }

        /*for(int i=0; i<st.size(); i++){
            sum += st.pop();
        }*/
        //종료조건을 i<st.size()로 하면 pop 후에 스택의 사이즈가 바껴서 반복문이 제대로 돌아가지 않음.

        System.out.println(sum);
    }
}
