package DataStruct.Sort;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[] arr={8,9,1,7,2,3,5,4,6,0};
        //shell排序交换法==》冒泡
        swapshellsort(arr);
        //shell排序移动法==》插入
        stepshellsort(arr);
    }

    public static void swapshellsort(int[] arr) {
        //shell交换法
        int temp=0;
        for (int gap=arr.length/2;gap>0;gap /= 2){
            //第一轮排序 10个数据分成5组
            for (int i=gap;i<arr.length;i++){
                //遍历各组中的元素
                for (int j=i-gap;j>=0;j-=gap){
                    if (arr[j]>arr[j+gap]){
                        temp =arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }
                }
                //第一轮排序的结果
                //System.out.println(Arrays.toString(arr));
            }
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
        /*
        int temp=0;
        //第一轮排序 10个数据分成5组
        for (int i=5;i<arr.length;i++){
            //遍历各组中的元素
            for (int j=i-5;j>=0;j-=5){
                if (arr[j]>arr[j+5]){
                    temp =arr[j];
                    arr[j]=arr[j+5];
                    arr[j+5]=temp;
                }
            }
            //第一轮排序的结果
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));


        //第二轮排序 5组 变2
        for (int i=2;i<arr.length;i++){
            //遍历各组中的元素
            for (int j=i-2;j>=0;j-=2){
                if (arr[j]>arr[j+2]){
                    temp =arr[j];
                    arr[j]=arr[j+2];
                    arr[j+2]=temp;
                }
            }
            //第一轮排序的结果
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));


        //第三轮排序 2组 变1
        for (int i=1;i<arr.length;i++){
            //遍历各组中的元素
            for (int j=i-1;j>=0;j-=1){
                if (arr[j]>arr[j+1]){
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            //第一轮排序的结果
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
*/


    }

    public static void stepshellsort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从gap的元素 插入排序
            for (int i=gap;i<arr.length;i++){
                int j=i; //待插入的位置保存
                int temp=arr[j];
                if (arr[j]<arr[j-gap]){
                    while (j-gap>0 && temp<arr[j-gap]){
                        //移动位置
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    //退出while 找到temp的位置
                    arr[j] = temp;
                }
            }
           // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
