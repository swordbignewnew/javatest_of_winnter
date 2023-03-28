package winterproject.ATMmodel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Atmwork {
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("=========欢迎使用北国银行系统，提瓦特最好的系统！========");
            System.out.println("1.登录账户!\n2.注册账户!\n3.退出!\n请选择您的操作！:");
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            switch (sc) {
                case 1:
                    System.out.println("======您已选择登录账号操作！======");
                    login(accounts);
                    break;
                case 2:
                    System.out.println("======您已选择注册账户操作！======");
                    accountlogn(accounts);
                    break;
                case 3:
                    flag = false;
                    System.out.println("======您已退出系统！======");
                    break;
                default:
                    System.out.println("你输入的命令错误？");
            }
        }
    }

    /*/
    账户注册功能
     */
    private static void accountlogn(ArrayList<Account> accounts) {
        Account mrsa = new Account();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===请输入你的名字===");
        String sc = scanner.next();
        mrsa.setName(sc);
        while (true) {
            System.out.println("===请输入你的密码===");
            String ps = scanner.next();
            System.out.println("===请再次确认你的密码===");
            String ps2 = scanner.next();
            if (ps2.equals(ps)) {
                mrsa.setPassword(ps2);
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入！");
            }
        }

        System.out.println("===请设置转账额度===");
        double qm = scanner.nextInt();
        mrsa.setQutomoney(qm);

        int k = cardid(accounts);
        System.out.println("你的卡号为：" + k);
        mrsa.setAccount(k);

        accounts.add(mrsa);
        System.out.println("恭喜" + mrsa.getName() + "你的卡号" + mrsa.getAccount() + "已成功注册！");
    }

    /*/
    卡号生成功能
     */
    public static int cardid(ArrayList<Account> accounts) {
        Random rd = new Random();
        int k = rd.nextInt(100000000);
        boolean flag = true;
        while (flag && accounts.size() >= 1) {
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getAccount() == k) {
                    k = rd.nextInt(100000000);
                } else if (accounts.get(i).getAccount() != k && i == accounts.size() - 1) {
                    flag = false;
                }
            }
        }
        return k;
    }

    /*/
        用户登录功能
         */
    private static void login(ArrayList<Account> accounts) {
        Scanner scanner = new Scanner(System.in);
        if (accounts.size()==0){
            System.out.println("系统中还没有账户，请先创建账户！");
            return;
        }
        while (true) {
            System.out.println("请输入你的卡号！：");
            int cardid = scanner.nextInt();
            Account users = getcardid(accounts, cardid);
            boolean flag = true;
            if (users!=null) {
                System.out.println("请输入你的密码：");
                while (flag) {
                    String password = scanner.next();
                    if (password.equals(users.getPassword())) {
                        flag = false;
                        System.out.println("恭喜你" + users.getName() + "你的卡号" + users.getAccount() + "已成功登录！");
                        function(users, accounts);
                        return;
                    } else {
                        System.out.println("请重新输入密码！");
                    }
                }
            }
            else {
                System.out.println("你输入的账户不存在!");
            }
        }
    }

    /*/
     查找卡号
     */
    private static Account getcardid(ArrayList<Account> accounts, int cardid) {
        Account choose = new Account();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccount() == cardid) {
                choose=accounts.get(i);
                return choose;
            }
        }
        return null;
    }
/*/
用户登录界面
 */
    private  static void function(Account account,ArrayList<Account> accounts){
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("======请进行用户操作======");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出系统");
            System.out.println("7.注销账户");
            int choose= scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("你已选择查询账户！");
                    checkaccount(account);
                    break;
                case 2:
                    System.out.println("你已选择存款！");
                    putinmoney(account);
                    break;
                case 3:
                    System.out.println("你已选择取款！");
                    putoutmonety(account);
                    break;
                case 4:
                    System.out.println("你已选择转账！");
                    givemoney(account,accounts);
                    break;
                case 5:
                    System.out.println("你已选择修改密码！");
                    passwordrset(account);
                    break;
                case 6:
                    System.out.println("你已选择退出系统！");
                    return;
                case 7:
                    System.out.println("你已选择注销账户！");
                    deleteaccount(accounts,account);
                    return;
                default:
                    System.out.println("你输入的命令错误？");
            }
        }
    }

    /*/
    注销账户
     */
    private static void deleteaccount(ArrayList<Account> accounts,Account account) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的密码再次确认！：");
        while (true) {
            String ps = scanner.next();
            if (ps.equals(account.getPassword())) {
                accounts.remove(account);
                System.out.println("你的账号已成功注销！");
                return;
            } else {
                System.out.println("你输入的密码错误，请重新输入！：");
            }
        }
    }

    /*/
    修改密码
     */
    private static void passwordrset(Account account) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的密码再次确认！：");
        while (true) {
            String ps= scanner.next();
            if (ps.equals(account.getPassword())){
                System.out.println("请输入你的新密码！：");
                String ps2= scanner.next();
                System.out.println("新密码设置成功！");
                account.setPassword(ps2);
                return;
            }
            else {
                System.out.println("你输入的密码错误，请重新输入！：");
            }
        }
    }

    /*/
    转账方法
     */
    private static void givemoney(Account account,ArrayList<Account> accounts) {
        if (accounts.size()>=2) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入你要转账的卡号！：");
            while (true) {
                int cardid=scanner.nextInt();
                Account acceptaccout=getcardid(accounts,cardid);
                if (acceptaccout!=null){
                    System.out.println("请输入你要转的金额！：");
                    while (true) {
                        int moneygiven=scanner.nextInt();
                        if (moneygiven<=account.getQutomoney()){
                            if (account.getMoney()-moneygiven>=0) {
                                account.setMoney(account.getMoney()-moneygiven);
                                acceptaccout.setMoney(acceptaccout.getMoney()+moneygiven);
                                return;
                            } else {
                                System.out.println("你要学钟离骗吃骗喝是吧？");
                                System.out.println("请重新输入转账金额！：");
                            }
                        }
                        else {
                            System.out.println("转账金额超过限定额度，请重新输入！：");
                        }
                    }
                }
                else {
                    System.out.println("你输入的卡号有误，请重新输入！：");
                }
            }
        }
        else {
            System.out.println("北国银行现在只有一名用户，请等待其他人开户再进行转账！");
        }
    }


    /*/
    取钱方法
     */
    private static void putoutmonety(Account account) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要取的钱！：");
        while (true) {
            double money=scanner.nextInt();
            if (account.getMoney()-money>=0) {
                money=account.getMoney()-money;
                account.setMoney(money);
                return;
            } else {
                System.out.println("想从北国银行空手套白狼是吧！");
                System.out.println("请重新输入你要取得钱！：");
            }
        }
    }

    /*/
    存钱方法
     */
    private static void putinmoney(Account account) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要存储的钱！：");
        double money=scanner.nextInt();
        money+=account.getMoney();
        account.setMoney(money);
    }

    /*/
    查询账户方法
     */
    private static void checkaccount(Account account){
        System.out.println("账户名:"+account.getName()+"\n"+"账户号："+account.getAccount()+"\n"+"账户余额："+account.getMoney()+"\n"+"限额："+account.getQutomoney());
    }
}
