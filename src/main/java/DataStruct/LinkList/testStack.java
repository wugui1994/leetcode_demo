package DataStruct.LinkList;

import java.util.Stack;

public class testStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.add("Tom1");
        stack.add("Tom2");
        stack.add("Tom3");

        while (stack.size()>0){
            System.out.printf(""+stack.pop());
        }
    }
}
