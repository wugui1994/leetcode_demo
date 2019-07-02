package DataStruct.LinkList;

public class Joseup {
    public static void main(String[] args) {
        //构建链表
        cicrlesinglelist cicrlesinglelist = new cicrlesinglelist();
        cicrlesinglelist.addBoy(5);
        cicrlesinglelist.showBoy();

    }
}
//创建单向环形链表
class cicrlesinglelist{
    //创建一个first
    private Boy first = new Boy(-1);
    //添加小孩节点 构建成一个环形的链表
    public void addBoy(int nums){
        if (nums < 1){
            return;
        }
        Boy curBoy = null;
        //使用for循环创建环形链表 first不能动
        for (int i=1;i<=nums;i++){
            Boy boy = new Boy(i);
            if (i == 1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            }else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy =  boy;
            }
        }
    }
    //遍历当前的环形链表
    public void showBoy(){
        if (first == null){
            return;
        }
        //firt不能动
        Boy cur = first;
        while (true){
            System.out.printf("编号%d\n",cur.getNo());
            if (cur.getNext()==first){
                break;
            }
            cur = cur.getNext();
        }
    }

    /**
     *
     * @param start 开始位置
     * @param countNum  数几下
     * @param nums  小孩的数量
     */
    public void outcicrle(int start,int countNum,int nums){
        if (first == null || start <1 || start > nums){
            return;
        }
        //创建一个辅助指针
        Boy helper =first;
        while (true){
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }
        //helper指向了最后节点 ==>开始出群操作

    }
}

//定义一个node
class Boy{
    private int no;
    private Boy next;
    public Boy(int no){
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
