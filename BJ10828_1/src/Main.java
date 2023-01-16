import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        int x;
        int N =sc.nextInt();
        sc.nextLine();
        Stack<Integer> st = new Stack<>();
        String result="";

        for(int i=0; i<N; i++){
            s= sc.next();
            switch (s){
                case "push": {
                    x= sc.nextInt();
                    st.push(x);
                    break;
                }
                case "pop":{
                    if(st.isEmpty())
                        result += "-1\n";
                    else
                        result += st.pop()+"\n";
                    break;
                }
                case "size":{
                    result += st.size()+"\n";
                    break;
                }
                case "empty":{
                    if(st.isEmpty())
                        result += "1\n";
                    else
                        result += "0\n";
                    break;
                }
                case "top":{
                    if(st.isEmpty())
                        result += "-1\n";
                    else
                        result += st.peek()+"\n"; //top아니고 peek
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
