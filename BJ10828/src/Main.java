import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        int x;
        int N = sc.nextInt();
        int[] result = new int[N];
        sc.nextLine();   //버퍼비우기
        ArrayStack<Integer> st = new ArrayStack<>();

        for(int i=0; i<result.length;i++){ //예제 출력처럼 출력하기 위해 답배열을 -2로 초기화
            result[i] = -2;
        }

        for(int i =0 ; i< N; i++){
            s = sc.next();
            switch (s){
                case "push":{
                    x = sc.nextInt();
                    st.push(x);
                    break;
                }
                case "pop":{
                    if(st.isEmpty())
                        result[i]=-1;
                    else
                        result[i]=st.pop();
                    break;
                }
                case "size":{
                    result[i]=st.size();
                    break;
                }
                case "empty":{
                    if(st.isEmpty())
                        result[i]=1;
                    else
                        result[i]=0;
                    break;
                }
                case "top":{
                    if(st.isEmpty())
                        result[i]=-1;
                    else
                       result[i]=st.top();
                    break;
                }
            }
        }

        for(int i=0; i<result.length; i++){
            if(result[i]!=-2)
                System.out.println(result[i]);
        }
    }
}
