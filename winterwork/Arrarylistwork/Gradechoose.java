package winterwork.Arrarylistwork;

import java.util.ArrayList;

//取分数80以上的

public class Gradechoose {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>();
        s.add(98);
        s.add(77);
        s.add(66);
        s.add(89);
        s.add(79);
        s.add(50);
        s.add(100);
        System.out.println(s);

        //对i每次删除进行减一操作或者反过来遍历集合

        for (int i = 0; i < s.size(); i++) {
            if(s.get(i)<80){
                s.remove(i);
                i-=1;
            }
        }
        System.out.println(s);
    }
}
