public class ArrayStack<E> implements StackInterface<E> {
    private E stack[];
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;

    public ArrayStack(){
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    public ArrayStack(int n){
        stack = (E[]) new Object[n];
        topIndex = -1;
    }

    public void push(E newItem){
        if (isFull())
        {   System.out.println("스택이 꽉 차있습니다.");
            return;}
        else
            stack[++topIndex]=newItem;
    }

    public E pop(){
        if(isEmpty()) {
            //System.out.println("스택이 비어있습니다.");
            return ERROR;
        }
        else
            return stack[topIndex--];
    }

    public E top(){
        if(isEmpty()){
            //System.out.println("스택이 비어있습니다.");
            return ERROR;
        }
        else
            return stack[topIndex];
    }

    public boolean isEmpty(){
        return (topIndex < 0);
    }

    public boolean isFull(){
        return (topIndex==stack.length-1);
    }

    public void popAll(){
        stack=(E[]) new Object[stack.length];
        topIndex=-1;
    }

    public int size(){
        return topIndex+1;
    }
}