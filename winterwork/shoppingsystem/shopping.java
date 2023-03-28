package winterwork.shoppingsystem;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Goods[] goodhave = new Goods[100];
        int count = 0;
        System.out.println("----欢迎使用商城购物系统！----");
        System.out.println("请选择如下操作！（输入序号）\n1.添加商品！\n2.查看商品！\n3.修改已选择的商品！\n4.购买商品！\n5.退出系统！");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你想选择的服务！：");
        int sc = scanner.nextInt();
        while (sc != 5) {
            switch (sc) {
                case 1:
                    count=add(goodhave,count);
                    break;
                case 2:
                    count=check(goodhave,count);
                    break;
                case 3:
                    update(goodhave,count);
                    break;
                case 4:
                    double money=buy(goodhave,count);
                    System.out.println("你需要支付的价格是："+money);
                    break;
            }
            System.out.println("----请选择如下操作！（输入序号）----\n1.添加商品！\n2.查看商品！\n3.修改已选择的商品！\n4.购买商品！\n5.退出系统！");
            System.out.print("请输入你想选择的服务！：");
            sc = scanner.nextInt();
        }
    }

    public static int add(Goods[] goodhave,int count) {
        System.out.println("----你已选择添加商品！----");
        show();
        System.out.print("请选择你想要购买的商品！：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Goods goods=new Goods();
        switch (choice) {
            case 1:
                System.out.print("是否购买(y/n)：");
                String sc = scanner.next();
                if (sc.equals("y")) {
                    goods.id = 1;
                    goods.name = "胡桃6命";
                    goods.price = 1999.9;
                    System.out.print("请输入购买数量：");
                    goods.getnumber = scanner.nextInt();
                    System.out.println("你已添加" + goods.name + "商品" + goods.getnumber + "件到购物车！");
                    goodhave[count]=goods;
                    count++;
                } else {
                    System.out.println("你已取消购买！");
                }
                break;
            case 2:
                System.out.print("是否购买(y/n)：");
                sc = scanner.next();
                if (sc.equals("y")) {
                    goods.id = 2;
                    goods.name = "夜兰6命";
                    goods.price = 1999.9;
                    System.out.print("请输入购买数量：");
                    goods.getnumber = scanner.nextInt();
                    System.out.println("你已添加" + goods.name + "商品" + goods.getnumber + "件到购物车！");
                    goodhave[count]=goods;
                    count++;
                } else {
                    System.out.println("你已取消购买！");
                }
                break;
            case 3:
                System.out.print("是否购买(y/n)：");
                sc = scanner.next();
                if (sc.equals("y")) {
                    goods.id = 3;
                    goods.name = " 刻晴加纳西妲6命";
                    goods.price = 2889.99;
                    System.out.print("请输入购买数量：");
                    goods.getnumber = scanner.nextInt();
                    System.out.println("你已添加 " + goods.name + " 商品" + goods.getnumber + " 件到购物车！");
                    goodhave[count]=goods;
                    count++;
                } else {
                    System.out.println("你已取消购买！");
                }
                break;
        }
        return count;
    }

    public static int check(Goods[] goods,int count) {
        Goods g=new Goods();
        System.out.println("------------------------你已购买的商品如下---------------------------");
        if (count>1){
            for (int i = 0; i < count-1; i++) {
                for (int j = i+1; j <count-i; j++) {
                    if (goods[i].id==goods[j].id){
                        goods[i].getnumber+=goods[j].getnumber;
                        for (int k = j; k <count-1 ; k++) {
                            goods[k]=goods[k+1];
                        }
                        count--;
                }
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("商品id:" + goods[i].id + "\n商品名称:" + goods[i].name + "\n商品价格:" + goods[i].price + "\n商品数量" + goods[i].getnumber);
            System.out.println("---------------------------------------------------");
        }
        return count;
    }
    public static void update(Goods[] goods,int count){
        Scanner scanner=new Scanner(System.in);
        System.out.println("-----请修改你想要修改的商品信息-----");
        System.out.print("请输入您想要修改的商品id：");
        int id=scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (id==goods[i].id){
                System.out.print("请选择你要修改的商品数量！：");
                int num=scanner.nextInt();
                goods[i].getnumber=num;
                System.out.println("----修改成功!----");
            }
        }
    }
    public static double buy(Goods[] goods,int count){
        System.out.println("----欢迎进入付款界面！----");
        double sumprice=0;
        for (int i = 0; i < count; i++) {
            sumprice+=(goods[i].price*goods[i].getnumber);
        }
        return sumprice;
    }
    public static void show(){
        System.out.println("小店现在拥有如下商品！");
        System.out.println("1.胡桃6命 1999.9\n2.夜兰6命 1999.9\n3.刻晴加纳西妲6命 2889.99");
        System.out.println("小店刚刚开张，商品不足，后续上架，还请见谅！");
        System.out.println("--------------------------------------");
    }
}
