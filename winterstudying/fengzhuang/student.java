package winterstudying.fengzhuang;

public class student {
    private  int age;
    public void setage(int age){
        if (age>=0&&age<=120){
            this.age=age;
        }
        else {
            System.out.println("please check your input!");
        }
    }
    public int getage(){
        return this.age;
    }
}
