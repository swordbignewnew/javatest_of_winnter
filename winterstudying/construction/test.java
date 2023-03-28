package winterstudying.construction;

public class test {
    public static void main(String[] args) {
        car c=new car();
        System.out.println(c.name);
        System.out.println(c.price);
        car s=new car("宝马",36.5);
        System.out.println(s.name);
        System.out.println(s.price);
    }
}
