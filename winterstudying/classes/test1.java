package winterstudying.classes;

public class test1 {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.name = "宝宝巴士");
        System.out.println(car.price = 38.8);
        car.start();
        car.run();
        Student st=new Student();
        System.out.println(st.age = 18);
        System.out.println(st.name = "teru");
        st.grade();
        //直接等于即地址相同！
        Student s2 = st;
        System.out.println(st);
        System.out.println(s2);
    }
}
