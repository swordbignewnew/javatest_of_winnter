package winterwork.Arrarylistwork;

public class Studentmode {
    String name;
    long non;
    int age;

    String classes;

    public Studentmode(String name, long non, int age ,String classes) {
        this.name = name;
        this.non = non;
        this.age = age;
        this.classes=classes;
    }

    public Studentmode() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNon() {
        return non;
    }

    public void setNon(int non) {
        this.non = non;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  setClasses(String classes){
        this.classes=classes;
    }

    public String getClasses(){
        return classes;
    }
}
