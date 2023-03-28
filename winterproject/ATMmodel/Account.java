package winterproject.ATMmodel;

public class Account {
    private String name;
    private  int account;
    private double money;
    private  String password;

    private double qutomoney;

    public Account(String name, int account, double money, String password,double qutomoney) {
        this.name = name;
        this.account = account;
        this.money = money;
        this.password = password;
        this.qutomoney=qutomoney;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getQutomoney(){
        return qutomoney;
    }

    public void setQutomoney(double qutomoney){
        this.qutomoney=qutomoney;
    }
}
