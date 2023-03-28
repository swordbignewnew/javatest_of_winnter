package winterwork.ticket;

import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        System.out.println("----欢迎进入购票优惠系统！----");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你购买机票的原价！：");
        double tickecost= scanner.nextDouble();
        System.out.println("请输入你登机的月份！：");
        int month=scanner.nextInt();
        System.out.println("请输入你的舱位（头等舱/经济舱）：");
        String seat=scanner.next();
        double prices=price(tickecost,month,seat);
        if (prices==0){
            System.out.println("输入月份错误！");
        }
        else {
            System.out.println("你的机票优惠后的价格为："+prices);
        }
    }
    public static double price(double ticketcost,int month,String seat){
        double prices=0.0;
        if (month>12){
            return 0;
        }
        switch (month){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if (seat.equals("头等舱")){
                    prices= ticketcost*0.9;
                }
               else {
                    prices= ticketcost*0.85;
                }
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
                if (seat.equals("头等舱")){
                    prices= ticketcost*0.7;
                }
                else {
                    prices= ticketcost*0.65;
                }
        }
        return prices;
    }
}
