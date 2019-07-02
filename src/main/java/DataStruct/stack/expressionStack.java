package DataStruct.stack;


/**
 * 栈的实际应用
 *    1.递归调用
 *    2.表达式转换
 *    3.二叉树遍历
 *    4.深度优先搜索法
 */
public class expressionStack {
    public static void main(String[] args) {
        String express="3+2*6-2";
        stackArray2 numStack = new stackArray2(10);
        stackArray2 operstack = new stackArray2(10);
        int index = 0;
        int num1=0;
        int num2=0;
        int oper=0;
        int res=0;
        char ch=' ';
        while (true){
             ch = express.substring(index, index + 1).charAt(0);
             if (operstack.isOper(ch)){
                 if (!operstack.isEmpty()){

                 }else {

                 }
             }

        }
    }
}

//创建一个栈
class stackArray2{
    private int maxsize;
    private int[] stack;
    private int top = -1;

    //构造器
    public stackArray2(int maxsize) {
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

    //返回运算符的优先级 使用数字表示
    public int priority(int oper){
        if (oper == '*' || oper=='/'){
            return 1;
        }else if (oper == '+' || oper=='-'){
            return 0;
        }else {
            return -1;
        }
    }

    //判断运算符
    public boolean isOper(char val){
        return val =='+' || val=='-' || val=='*'|| val=='/';
    }

    //计算方法
    public int cal(int num1,int num2,int oper){
        int res=0;
        switch (oper){
            case '+':
                res=num1+num2;
                break;
            case '-':
                res=num2-num1;
                break;
            case '*':
                res=num1*num2;
                break;
            case '/':
                res=num2/num1;
                break;
            default:
                break;
        }
        return res;
    }
}

