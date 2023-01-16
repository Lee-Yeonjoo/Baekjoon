import java.util.Scanner;

public class Main {
    public static char[] stack = new char[50];
    public static int topIndex=-1;

    public static void push(char x){
        if(isFull())
            System.out.println("스택이 꽉 참");
        else
            stack[++topIndex]=x;
    }

    public static boolean isFull(){
        if(topIndex==stack.length-1) return true;
        else return false;
    }

    public static char pop() {
        if (isEmpty())
            return 'n';
        else
            return stack[topIndex--];
    }

    public static boolean isEmpty(){
        if(topIndex==-1) return true;
        else return false;
    }

    public static void popAll(){
        topIndex = -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[T];

        for(int i=0; i<T; i++){
            arr[i] = sc.nextLine();
        }

        Loop: for(int i=0; i<T; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j)=='(')
                    push('(');
                else{
                    if(isEmpty()){
                        System.out.println("NO");
                        continue Loop;
                    }
                    else pop();
                }
            }
            if(isEmpty()) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");

            popAll();
        }
    }
}
