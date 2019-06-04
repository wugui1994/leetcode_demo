package DataStruct.search;

import java.util.ArrayList;

public class MiddleSearch {
    //使用二分查找的数组必须是有序的
    public static void main(String[] args) {
        int[] arr={1,8,10,88,9,1001,1001,1001,1234};
        int index = Middlesearch(arr,0,arr.length-1,8888);
        System.out.println(index);
        ArrayList arrayList = Middlesearch1(arr, 0, arr.length - 1, 1001);
        System.out.println(arrayList);
    }

    /**
     *
     * @param arr
     * @param left
     * @param right
     * @param value  查找的值
     * @return
     */
    public static int Middlesearch(int[] arr,int left,int right,int value) {
        int mid = (left+right)/2;
        int midvalue = arr[mid];
        if (left>right){
            return -1;//递归跳出的条件
        }

        if (value>midvalue){
            return Middlesearch(arr,mid+1,right,value);
        }else if (value<midvalue){
            return Middlesearch(arr,right,mid-1,value);
        }else {
            return mid;
        }
    }

    /**
     *   * 查找所有的数据索引
     * @param arr
     * @param left
     * @param right
     * @param value
     * @return
     */
    public static ArrayList Middlesearch1(int[] arr, int left, int right, int value) {
        System.out.println("没有优化的查找的次数");

        int mid = (left+right)/2;
        int midvalue = arr[mid];
        if (left>right){
            return new ArrayList();//递归跳出的条件
        }

        if (value>midvalue){
            return Middlesearch1(arr,mid+1,right,value);
        }else if (value<midvalue){
            return Middlesearch1(arr,right,mid-1,value);
        }else {
            ArrayList<Integer> indexlist = new ArrayList<>();
            int temp = mid - 1;//左边循环查找
            while (true){
                if (temp<0 || arr[temp] != value){
                    break;//向左边的扫描的值没有找到
                }
                indexlist.add(temp);
                temp -= 1;
            }
            indexlist.add(mid);

            //右边扫描的循环查找
            temp = mid + 1;
            while (true){
                if (temp>arr.length-1 ||arr[temp]!=value){
                    break;
                }
                indexlist.add(temp);
                temp += 1;
            }
            return indexlist;
        }

    }
}

