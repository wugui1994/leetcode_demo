package DataStruct.LinkList;

import java.util.Stack;

public class LinkListDemo1 {
    public static void main(String[] args) {
        //链表在内存里面不是连续存储的是链式存储的
        //链表分为
        //   1.带头结点的单链表 head
        //   2.不带头的单链表

        //单向链表的增 删  改  查
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "宋江1", "及时雨1");
        HeroNode hero3 = new HeroNode(3, "宋江2", "及时雨2");
        HeroNode hero4 = new HeroNode(4, "宋江3", "及时雨3");
        HeroNode hero5 = new HeroNode(5, "宋江4", "及时雨4");

        linkedlist linkedlist = new linkedlist();
        linkedlist.addHeroNode(hero1);
        linkedlist.addHeroNode(hero2);
        linkedlist.addHeroNode(hero3);
        linkedlist.addHeroNode(hero4);
        linkedlist.addHeroNode(hero5);
        linkedlist.list();

        System.out.println("---------------");
        HeroNode hero7 = new HeroNode(7, "宋江", "及时雨");
        HeroNode hero8 = new HeroNode(8, "宋江1", "及时雨1");
        HeroNode hero9 = new HeroNode(9, "宋江2", "及时雨2");
        HeroNode hero10 = new HeroNode(11, "宋江3", "及时雨3");
        HeroNode hero11 = new HeroNode(10, "宋江4", "及时雨4");

        linkedlist.addHeroNodeSort(hero7);
        linkedlist.addHeroNodeSort(hero8);
        linkedlist.addHeroNodeSort(hero9);
        linkedlist.addHeroNodeSort(hero10);
        linkedlist.addHeroNodeSort(hero11);

        linkedlist.list();




    }

    //获取单链表节点的个数
    public  static int getLnegth(HeroNode head){
        if (head.next == null){
            return 0;
        }
        int length=0;
        HeroNode cur = head.next;
        while (cur != null){
            length ++;
            cur = cur.next;
        }
        return length;
    }

    public static void reverseList(HeroNode head){
        //如果当前链表为空 或者只有一个节点不需要反转
        if (head.next == null || head.next.next == null){
            return;
        }

        //定义一个负责变量遍历原来的链表
        HeroNode cur =head.next;
        HeroNode next = null;//指向当前节点的下一个节点 cur
        HeroNode resver = new HeroNode(0,"","");
        //遍历原来链表 取出 放到 resver最前端
        while (cur != null){
            //为空遍历结束
            //暂时保存下一个节点
            next = cur.next;
            cur.next = resver.next;

        }
    }

    public static void resverprint(HeroNode head){
        if (head.next == null){
            return;
        }
        //创建一个栈
        Stack<HeroNode> stack = new Stack();

        HeroNode cur = head.next;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        //打印
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}

//定义一个linkdelist  管理英雄人物
class linkedlist{
    //初始头节点
    private HeroNode head = new HeroNode(0,"","");

    //添加节点到单向链表
    public void addHeroNode(HeroNode heroNode){
        //当不考虑顺序时   找到最后节点数据 将next指向新的节点数据

        HeroNode temp = head;

        while (true){
            if (temp.next == null){
                break;
            }else {
                temp = temp.next;
            }
        }
        //退出循环 temp指向 null
        temp.next =heroNode;
    }

    public void addHeroNodeSort(HeroNode heroNode){
        //1.先找到新添加节点的位置 辅助指针  在遍历
        //添加这个位置的前一个节点 添加位置的前一个节点
        HeroNode temp = head;
        boolean falg = false; //标记编号是否存在

        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no >heroNode.no){
                //位置找到了 加在 temp 和 temp.next之间
                break;
            }else if (temp.next.no == heroNode.no){
                falg = true; //编号成立
                break;
            }
            temp = temp.next;
        }
        //判断是否需要添加
        if (falg){
            System.out.println("已经有了"+heroNode.no);
        }else{
            //可以加入
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //修改节点信息  根据 no
    public void update(HeroNode heroNode){
        if (head.next == null) {

            System.out.printf("空");
            return;
        }

        HeroNode temp = head;
        boolean falg = false;
        while (true){
            if (temp == null){
                break;
            }
            if (temp.no == heroNode.no){
                falg = true;
                break;
            }
            temp = temp.next;

        }
        if (falg){
            temp.name = heroNode.name;
            temp.nickName=heroNode.nickName;
        }else {
            System.out.printf("没有找到");
        }
    }

    //遍历数据
    public void list(){
        if (head.next == null){
            System.out.printf("为空");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            //是否到最后
            if (temp==null){
                break;
            }
            System.out.println(temp);
            temp =temp.next;
        }


    }

}

//定义node
class HeroNode{
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;//指向下一个节点

    //构造器
    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +

                '}';
    }
}
