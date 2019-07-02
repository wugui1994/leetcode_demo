package DataStruct.stack;


public class stackdemo {
    public static void main(String[] args) {
        //数组模拟栈
        stackArray stackArray = new stackArray(4);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.list();

    }
}
class stackArray{
    private int maxsize;
    private int[] stack;
    private int top = -1;

    //构造器
    public stackArray(int maxsize) {
        this.maxsize = maxsize;
        stack = new int[this.maxsize];
    }

    //栈满
    public boolean isFull(){
        return top == maxsize-1;
    }
    //栈空
    public boolean isEmpty(){
        return top==-1;
    }

    //入栈
    public void push(int value){
        if (isFull()){
            return;
        }
        top++;
        stack[top] = value;
    }
    //出栈
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈空");
        }
        int value = stack[top];
        top --;
        return value;
    }
    //显示栈
    public void list(){
        if (isEmpty()){
            return;
        }
        for (int i=top;i>=0;i--){
            System.out.printf("stack[%d]=%d",i,stack[i]);
        }
    }
}
