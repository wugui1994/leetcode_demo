package DataStruct.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={3,9,-1,10,-2};
        bubbleSort(array);

    }
    public static void bubbleSort(int[] array){
        //冒泡排序的算法
        //  int[] array={3,9,-1,10,20};
        int temp=0;
        boolean flag = false; //优化的功能点
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    flag = true;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
            System.out.println("排序的次数+"+i);
            System.out.println(Arrays.toString(array));
            if (!flag){
                break;
            }else {
                flag=false;
            }
        }

        /**
         int temp=0;
         for (int j=0;j<array.length-1;j++){
         if (array[j]>array[j+1]){
         temp = array[j];
         array[j]=array[j+1];
         array[j+1]=temp;
         }
         }

         for (int j=0;j<array.length-1-1;j++){
         if (array[j]>array[j+1]){
         temp = array[j];
         array[j]=array[j+1];
         array[j+1]=temp;
         }
         }

         for (int j=0;j<array.length-1-2;j++){
         if (array[j]>array[j+1]){
         temp = array[j];
         array[j]=array[j+1];
         array[j+1]=temp;
         }
         }
         */
    }
}
