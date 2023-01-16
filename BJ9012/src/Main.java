import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); //버퍼 비우기
        String[] arr= new String[T];
        String[] result= new String[T];
        ArrayStack<Character> st = new ArrayStack<>(50);

        for(int i=0; i<T;i++){
            arr[i]=sc.nextLine();
        }

        for(int i=0; i<T; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j)=='('){
                    st.push('(');
                }
                else{
                    if(st.isEmpty())
                        result[i] ="NO";
                    else
                        st.pop();
                }
            }
            if(!st.isEmpty()){
                result[i] = "NO";
            }
            else if(result[i] == null){
                result[i] = "YES";
            }
            st.popAll(); //스택 비우기 꼭 해야함!!
        }

        for(int i=0; i<T; i++){
            System.out.println(result[i]);
        }
    }
}
