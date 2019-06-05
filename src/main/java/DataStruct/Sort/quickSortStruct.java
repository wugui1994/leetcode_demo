package DataStruct.Sort;

import java.util.Arrays;
//1.条件： i j相遇不在动  把基准数进行相关的交换 ==>第一轮结束

public class quickSortStruct {
    public static void main(String[] args) {
        //快速排序
        int[] arr = {6,3,7,9,1,2};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left,int right) {
        if (left>right){
            return;
        }
        //保存基准数
        int base = arr[left];
        //定义变量 左右
        int i = left;
        int j = right;
        //左边为基准数 右边先比较
        while (i != j){
            //循环比较检索
            //先右边检索
            while (arr[j] >= base && i<j){
                j--;//条件不成立 j元素找到
            }
            //左边检索
            while (arr[i] <= base && i<j){
                i++;
            }
            //这里代表 i j都停止了
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;

        }
        //如果条件不成立代表i 和 j相遇了
        //交换基准数和相遇位置的元素
        arr[left] = arr[i];
        arr[i] = base;

        quickSort(arr,left,i-1);
        quickSort(arr,j+1,right);

    }
}

