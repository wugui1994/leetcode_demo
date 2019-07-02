package DataStruct.recursion;

public class recursion {
    public static void main(String[] args) {
        //递归调用机制
        //递归使用的场景  各种排序问题 树图的各种使用场景
        //案例迷宫问题

        //1.创建迷宫 二维数组
        int[][] map = new int[8][7];
        //使用1 表示墙 ==》上下在变 左右在变
        for (int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }

        for (int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        //设置挡板
        map[3][1] = 1;
        map[3][2] = 1;
        //输出
        for (int i=0;i<8;i++){
            for (int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        setway(map,1,1);


        for (int i=0;i<8;i++){
            for (int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    //使用递归找到路径

    /**
     *
     * @param map  表示出发点
     * @param i  开始的位置出发点
     * @param j
     * @return 如果返回true 表示找到通路 如果false就是墙
     * 约定 0表示 没有走过 1 表示墙 2表示路通 3表已经走过但是走不通
     */
    public static boolean setway(int[][] map,int i,int j){
        if (map[6][5]==2){
            return true;
        }else {
            if (map[i][j]==0){
                map[i][j] = 2;
                if (setway(map,i+1,j)){
                    //向下
                    return true;
                }else if(setway(map,i,j+1)){
                    return true;
                }else if (setway(map,i-1,j)){
                    return true;
                }else if (setway(map,i,j-1)){
                    return true;
                }else {
                    map[i][j]=3;
                    return false;
                }
            }else {
                return false;
            }
        }

    }
}
