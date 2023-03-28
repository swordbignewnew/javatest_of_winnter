package winterstudying.Javabean;

public class Test {
    public static void main(String[] args) {
        User u=new User();
        u.setName("teru");
        u.setHeight(170.5);
        u.setSalary(1000);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());
    }
}
