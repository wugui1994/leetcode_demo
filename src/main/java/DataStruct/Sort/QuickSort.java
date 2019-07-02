package DataStruct.Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,-567,70};
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int left,int right) {
        int l = left;//左边的下标
        int r = right;//右边的下标
        int poivt = arr[(left+right)/2];
        int temp = 0;//交换时候使用

        //比poivt小的放到左边
        while (l<r){
            //找到大于povit值
            while (arr[l]<poivt){
                l += 1;
            }
            while (arr[r]>poivt){
                r -= 1;
            }

            if (l>=r){
                break;
            }

            temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            //交换完成
            if (arr[l]==poivt){
                r -=1;
            }
            if (arr[r]==poivt){
                l +=1;
            }
        }

        if (l == r){
            l += 1;
            r -= 1;
        }
        if (left<r){
            quickSort(arr,left,r);
        }
        if (right>l){
            quickSort(arr,l,right);
        }

    }
}
