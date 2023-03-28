package winterwork.Arrarylistwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentsearch {
    public static void main(String[] args) {
        ArrayList<Studentmode> st = new ArrayList<>();
        Studentmode stu1 = new Studentmode("叶孤城", 20180302, 23, "护理一班");
        Studentmode stu2 = new Studentmode("叶城", 20180332, 23, "护理二班");
        Studentmode stu3 = new Studentmode("叶孤", 20180902, 23, "护理十一班");
        Studentmode stu4 = new Studentmode("孤城", 20190302, 23, "护理四班");

        st.add(stu1);
        st.add(stu2);
        st.add(stu3);
        st.add(stu4);


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入您要查询的学号 ");
            long input = sc.nextInt();
            Studentmode s= studentsearches(st,input);
            
           if (s==null){
               System.out.println("查无此人");
               System.out.println("-------------");
           }
           
           else {
               System.out.println("已为你查找到该学生！");
               System.out.println("姓名：" + s.name);
               System.out.println("学号：" + s.non);
               System.out.println("年龄：" + s.age);
               System.out.println("班级：" + s.classes);
               System.out.println("-------------");
           }
           
        }
    }

    public static Studentmode studentsearches(ArrayList<Studentmode> st, long studentnon) {
        for (Studentmode studentmode : st) {
            if (studentmode.non == studentnon) {
                return studentmode;
            }
        }
        return null;
    }
}

