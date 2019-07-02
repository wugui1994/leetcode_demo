package DataStruct.Sort;

public class RadixSort {
    public static void main(String[] args) {
        int arr[]={56,3,542,748,14,214};
    }
    //基数排序
    public static void radixsort(int[] arr) {

        //第一轮争对每一个元素进行相关的排序
        //声明的一个桶

        int[][] bucket = new int[10][arr.length];

        //记录每个桶的数据 定义一个一维数组 记录每个桶的数据
        int[] bucketcount = new int[10];
        for (int j=0;j<arr.length;j++){
            //取出每个元素的个位数
            int digiof = arr[j]%10;
            bucket[digiof][bucketcount[digiof]] = arr[j];
            bucketcount[digiof]++;
        }






    }

}
