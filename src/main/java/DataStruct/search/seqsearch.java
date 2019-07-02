package DataStruct.search;

public class seqsearch {
    public static void main(String[] args) {
        int arr[] = {1,9,11,-1,34,89,11};
        int[] index = seqsearch(arr,11);
        if (index.equals("")){
            System.out.println("没有找到");
        }else {
            System.out.println("找到");
            for (int i=0;i<index.length;i++){
                if (index[i]!=0) {
                    System.out.println(index[i]);
                }
            }
        }
    }

    /**
     * 线性查找的算法
     * @param arr
     * @param value
     * @return
     */
    public static int[] seqsearch(int[] arr,int value) {
        int[] a = new int[10];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                a[index++] = i;
            }
        }
        return a;
    }
}
