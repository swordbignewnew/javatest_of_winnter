package winterstudying.Arrarylist;


import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加数据 :  add()
        list.add("hy");
        list.add("teru");
        list.add("1111");
        System.out.println(list);
        System.out.println("--------------------");

        //3.插入数据  add(int index, String element)
        list.add(1, "gyt");
        System.out.println(list);
        System.out.println("--------------------");

        //4.获取集合的大小: int size()
        int count = list.size();
        System.out.println(count);
        System.out.println("--------------------");

        //5.集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------");

        //6.删除某个索引位置的元素值: remove(int index)
        list.remove(2);
        System.out.println(list);
        System.out.println("--------------------");

        //7.直接删除元素:  remove( String element )  若有多个相同元素则删除第一个
        list.remove("1111");
        list.add("1314");
        System.out.println(list);
        System.out.println("--------------------");

        //8.修改某个索引位置的元素值:   set()
        list.set(2, "1314520");
        System.out.println(list);
    }
}