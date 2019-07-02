package DataStruct.search;

public class InsertValueSearch {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i=0;i<100;i++){
            arr[i] = i+1;
        }
        int index = insertValueSearch(arr, 0, arr.length - 1, 1);
        System.out.println(index);
    }
    //插值查找算法 ==>数组有序同时对于数据数据量大的情况
    //             ==>连续的值使用这个算法比较好 性能比较高
    public static int insertValueSearch(int[] arr,int left,int right,int findValue) {
        System.out.println("查找的次数");
        if (left>right || findValue < arr[0] || findValue >arr[arr.length-1] ){
            return -1;
        }
        //求出mid
        int mid=left+(right-left)*(findValue-arr[left])/(arr[right]-arr[left]);
        int midVal = arr[mid];
        if (findValue>midVal){
            return insertValueSearch(arr,mid+1,right,findValue);
        }else if (findValue<midVal){
            return insertValueSearch(arr,left,mid-1,findValue);
        }else {
            return mid;
        }


    }
}
