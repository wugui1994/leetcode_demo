package DataStruct.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation {
    public static void main(String[] args) {

    }

    /**
     * 1.将中缀表达式转换成list
     * @param s =1+((2+3)*4)-5
     * @return
     */
    public static List<String> toInfixExpressionList(String s) {
        //定义一个list存储对应的内容
        ArrayList<String> list = new ArrayList<>();
        //定义遍历的指针
        int i=0;
        String str;
        char c;
        do {
            if ((c=s.charAt(i))<48 || (c=s.charAt(i))>57){
                list.add(" "+c);
                i++;
            }else {
                str = "";
                while (i<s.length() && (s.charAt(i)>=48) && (s.charAt(i)<=57)){
                    str += c;
                    i++;
                }
                list.add(str);
            }
        }while (i<s.length());
        return list;
    }
    /**
     *2.中缀转成后缀表达式
     */
    public static List<String> parseList(List<String> ls) {
        //定义两个栈
        Stack<String> s1 = new Stack<>();//符号栈
        List<String> list = new ArrayList<String>();

        //遍历
        for (String item:ls){
            //数
            if (item.matches("\\d+")){
                list.add(item);
            }else if (item.equals("(")){
                s1.push(item);
            }else if(item.equals(")")){
                //符合右边的问题处理
                while (!s1.peek().equals("(")){
                    list.add(s1.pop());
                }
                s1.pop();
            }else {
                //优先级的问题

            }
        }
        return list;
    }


}
