package DataStruct.Sort;

import java.util.Arrays;

public class MergetSort {
    public static void main(String[] args) {
        int arr[]={8,4,5,7,1,3,6,2};
        int temp[] = new int[arr.length];
        mergesort1(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));


    }

    public static void mergesort1(int[] array,int left,int right,int[] temp) {
        if (left<right){
            int mid = (left+right)/2;
            //左边分解
            mergesort1(array,left,mid,temp);
            //右边分解
            mergesort1(array,mid+1,right,temp);
            //合并
            mergesort(array,left,mid,right,temp);

        }
    }
    /**
     * 需要排序的数组
     * @param array
     * @param left
     * @param mid
     * @param right
     * @param temp
     */
    public static void mergesort(int[] array,int left,int mid,int right,int[] temp) {
        System.out.println("出现运行的此时运行7次合并的次数");

        int i = left;
        int j = mid+1;
        int t = 0; //指向temp的当前索引

        //1.先把左右两边的数据按照规则填充到temp数组一直到一边的数据处理完
        while (i<=mid && j<=right){
            if (array[i]<array[j]){
                temp[t] = array[i];
                t += 1;
                i += 1;
            }else {
                temp[t] = array[j];
                t += 1;
                j += 1;
            }
        }
        //2.把有剩余数据的一边数据全部填充到temp中
        while (i <= mid){
            temp[t] = array[i];
            t += 1;
            i += 1;
        }

        while (j<= right){
            temp[t] = array[j];
            t += 1;
            j += 1;
        }
        //3.将temp数组的元素拷贝到arr中
         /*
        0 1
        2 3
        0 3
        0 7
         */
        t = 0;
        int tempLeft = left;
        System.out.println(tempLeft+"\n"+right);
        while (tempLeft <= right){
            array[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }
    }
}
