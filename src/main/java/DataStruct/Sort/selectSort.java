package DataStruct.Sort;


import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        selectsort(arr);
    }

    /**
     * 选择排序
     * @param array
     */
    public static void selectsort(int[] array) {

        for (int i=0;i<array.length-1;i++){
            int minIndex=i;
            int min=array[i];
            for (int j=i+1;j<array.length;j++){
                if (min>array[j]){//一次循环结束找到最小的数据和索引位置
                    min=array[j];
                    minIndex=j;
                }
            }
            //找到最小的位置索引和值
            System.out.println(min+""+minIndex);
            if (minIndex!=i) {
                array[minIndex] = array[i];
                array[i] = min;
            }

            System.out.println(i+1);
            System.out.println(Arrays.toString(array));

        }
        //算法的思想 先简单在复杂
//        int minIndex=0;
//        int min=array[0];
//        for (int j=0+1;j<array.length;j++){
//            if (min>array[j]){//一次循环结束找到最小的数据和索引位置
//                min=array[j];
//                minIndex=j;
//            }
//        }
//        //找到最小的位置索引和值
//        System.out.println(min+""+minIndex);
//        array[minIndex]=array[0];
//        array[0]=min;

    }
}
