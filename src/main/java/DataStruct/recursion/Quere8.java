package DataStruct.recursion;

public class Quere8 {
    int max=8;
    int[] arr = new int[max];
    public static void main(String[] args) {


    }

    //写一个方法 将皇后的位置输出

    //查看放置第n个和前面的是否冲突
    private boolean juddge(int n){
        for (int i=0;i<n;i++){
            //检查同一列 或者斜线上
            if (arr[i]==arr[n] || Math.abs(n-1) == Math.abs(arr[n]-arr[i])){
                return false;
            }
        }
        return true;
    }

    //放置第n个皇后
    private void check(int n){
        if (n==max){
            return;
        }
        //放皇后
        for (int i=0;i<max;i++){
            //先把当前的这个皇后放置在第n行 第1列
            arr[n] = 1;
            if (juddge(n)){
                //不冲突放n+1个皇后
                check(n+1);
            }
            //如果冲突 移动该皇后的位置
        }
    }
}
