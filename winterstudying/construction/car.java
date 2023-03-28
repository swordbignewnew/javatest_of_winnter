package winterstudying.construction;

public class car {
    String name;
    double price;
    public  car() {
        System.out.println("==无参数构造==");
    }
    public  car (String name,double price){
        System.out.println("==有参数构造==");
        this.name=name;
        this.price=price;
    }
}
