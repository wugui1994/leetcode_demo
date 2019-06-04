package DataStruct.hashTableDemo;

import java.util.Scanner;

public class hashtableData {
    public static void main(String[] args) {
        ///由于hash表一次可以管理7/8条链表
        hashTable table = new hashTable(7);
        Emp zhangsang1 = new Emp(1, "zhangsang1");
        table.add(zhangsang1);
        Emp zhangsang2 = new Emp(1, "zhangsang2");
        table.add(zhangsang2);
        Emp zhangsang3 = new Emp(1, "zhangsang3");
        table.add(zhangsang3);
        Emp zhangsang4 = new Emp(3, "zhangsang1");
        table.add(zhangsang4);
        Emp zhangsang5 = new Emp(4, "zhangsang2");
        table.add(zhangsang5);
        Emp zhangsang6 = new Emp(5, "zhangsang3");
        table.add(zhangsang6);
        Emp zhangsang7 = new Emp(6, "zhangsang3");
        table.add(zhangsang7);
        table.list();

        /*
        //写一个简单的菜单
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add:  添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("find: 查找雇员");
            System.out.println("exit: 退出系统");

            key = scanner.next();
            switch (key){
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();
                    Emp emp = new Emp(id, name);
                    table.add(emp);
                    break;
                case "list":
                    table.list();
                    break;
                case "find":
                    System.out.println("请输入要查找的id");
                    id = scanner.nextInt();
                    table.findEmpById(id);
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }


        }*/
    }
}
//hash表的数据结构相关的使用
//存储数据的详情信息
class Emp{
    public int id;
    public String name;
    public Emp next; //默认为空

    public Emp(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
//链表数据的存储 链表的数据结构
class EmpLinkedList{
    //头指针指向第一个Emp
    private Emp head;
    //添加员工到Emp
    public void add(Emp emp){
        //加入到链表的最后
        //1.添加第一个
        if (head == null){
            head = emp;
            return;
        }
        //不是添加第一个
        Emp curent = head;
        while (true){
            if (curent.next == null){
                break;
            }
            curent = curent.next;
        }
        //直接加入
        curent.next = emp;
    }

    //遍历
    public void list(int no){
        if (head==null){
            System.out.println("当前"+(no+1)+"链表信息为空");
            return;
        }
        System.out.println("当前的+"+(no+1)+"+信息");
        Emp curent = head;
        while (true){
            System.out.printf("==>%d name=%s\t",curent.id,curent.name);
            if (curent.next==null){
                break;
            }
            curent = curent.next;
        }
        System.out.println();
    }

    //根据id查找雇员
    public Emp findEmpById(int id){
        if (head == null){
            System.out.println("链表为空");
            return null;
        }
        Emp curent =head;
        while (true){
            if (curent.id == id){
                break;
            }
            if (curent.next == null){
                curent = null;
                break;
            }
            curent = curent.next;

        }
        return curent;
    }
}

//数组存储链表的数据
class hashTable{
    private EmpLinkedList[]  empLinkedlistArr;
    private int size;// 链表的个数

   //构造器
    public hashTable(int size){
        this.size=size;
        //初始化
        empLinkedlistArr = new EmpLinkedList[size];
        //这里需要初始化
        for (int i=0;i<size;i++){
            empLinkedlistArr[i] = new EmpLinkedList();
        }
    }

    //添加数据
    public void add(Emp emp){
        //根据员工的id的判断员工的数据添加到那个链表中
        int emplistNo =hashfun(emp.id);
        empLinkedlistArr[emplistNo].add(emp);
    }
    //遍历所有的链表数据
    public void list(){
        for (int i=0;i<size;i++){
            empLinkedlistArr[i].list(i);
        }
    }

    public void findEmpById(int id){
        int empNo = hashfun(id);
        Emp em = empLinkedlistArr[empNo].findEmpById(id);
        if (em != null){
            System.out.printf("在第%d条链表中找到 雇员 id = %d\n", (empNo + 1), id);
        }else {
            System.out.println("在哈希表中，没有找到该雇员~");
        }
    }


    //遍历散列函数
    public int hashfun(int id){
        return id%size;
    }
}

