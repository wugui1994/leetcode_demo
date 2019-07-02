package DataStruct.search;

import java.util.Arrays;

public class FibonacciSearch {
    public static int maxsize=20;
    public static void main(String[] args) {
        int[] arr={1,8,10,89,1000,1234};

    }

    public static int[] fib() {
        int[] f = new int[maxsize];
        f[0]=1;
        f[1]=0;
        for (int i=2;i<maxsize;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }

    public static int fiSearch(int[] arr,int key) {
        int low = 0;
        int high = arr.length - 1;
        int k = 0; //取的k值的关键
        int mid = 0;
        int f[]=fib();//获取斐波拉其数列
        while (high>f[k]-1){
            k++;
        }
        //因为f[k]
        int[] temp = Arrays.copyOf(arr,f[k]);
        return low;

    }
}
